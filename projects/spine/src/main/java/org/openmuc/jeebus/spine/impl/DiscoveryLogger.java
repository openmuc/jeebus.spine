/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.module.jakarta.xmlbind.JakartaXmlBindAnnotationModule;
import org.openmuc.jeebus.spine.api.Device;
import org.openmuc.jeebus.spine.xsd.v1.NodeManagementDetailedDiscoveryDataType;
import org.openmuc.jeebus.spine.xsd.v1.NodeManagementUseCaseDataType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * There are three different ways to configure whether to do discovery logging and which directory to use, listed in decreasing order of priority:
 * <ul>
 * <li>by calling methods {@link DeviceImpl#setDiscoveryLogging(boolean)} and {@link DeviceImpl#setDiscoveryLogPath(File)} or the equivalent methods of {@link DeviceBuilder}</li>
 * <li>by setting java system property {@code jeebus.logDiscovery=[true|false]} and/or {@code jeebus.logDiscoveryDirectory=<path>}.</li>
 * <li>by setting environment variables {@code JEEBUS_LOG_DISCOVERY=[true|false]} and/or {@code JEEBUS_LOG_DISCOVERY_DIR=<path>}</li>
 * </ul><p>
 * If only a directory is set via system property or environment variable, logging will also be enabled automatically.
 */
public class DiscoveryLogger {
    private static final Logger LOGGER = LoggerFactory.getLogger(DiscoveryLogger.class);
    private static final ObjectMapper MAPPER = JsonMapper
        .builder()
        .serializationInclusion(JsonInclude.Include.NON_EMPTY)
        .addModule(new JakartaXmlBindAnnotationModule())
        .enable(SerializationFeature.INDENT_OUTPUT)
        .build();
    // list of characters taken from https://stackoverflow.com/questions/893977/java-how-to-find-out-whether-a-file-name-is-valid#894133
    // not guaranteed to be a complete solution, but should turn *most* addresses
    // into usable filenames
    private static final String BAD_FILENAME_CHARACTERS
        = "[/\n\r\t\0\f`?*\\\\<>|\":]";

    private final ConcurrentMap<String, NodeManagementDetailedDiscoveryDataType>
        waitingDetailedDiscovery = new ConcurrentHashMap<>();

    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    /**
     * are we actually logging data?
     * <p>
     * this is a status flag that basically stops the logger from doing anything at all
     * if it is false
     */
    private volatile boolean enabled;

    /**
     * current log path. written only under {@code synchronized(this)}.
     */
    private volatile File logPath = new File("logs/discovery");
    /**
     * did we already call {@code logPath.mkdirs()} ?
     * <p>
     * it is ok if we read a stale 'false' value from this occasionally,
     * because calling {@link File#mkdirs()} multiple times is harmless.
     * <p>
     * we never read a stale {@code true} value because the only true->false transition
     * is under the same {@code synchronized(this)} block as the {@link #logPath} write
     * that necessitates it
     */
    private volatile boolean didMkdir = false;

    {
        String doLoggingProp = System.getProperty("jeebus.logDiscovery");
        if (doLoggingProp == null) doLoggingProp = System.getenv("JEEBUS_LOG_DISCOVERY");
        if (doLoggingProp == null) doLoggingProp = "";
        doLoggingProp = doLoggingProp.toLowerCase(Locale.ROOT);

        String loggingDir = System.getProperty("jeebus.logDiscoveryDirectory");
        if (loggingDir == null) loggingDir = System.getenv("JEEBUS_LOG_DISCOVERY_DIR");
        if (loggingDir == null) loggingDir = "";

        LOGGER.info("Discovery logger startup: ...logDiscovery={}, logDiscoveryDirectory={}", doLoggingProp, loggingDir);
        enabled = !loggingDir.isEmpty() && !doLoggingProp.equals("false") || doLoggingProp.equals("true");
        if (!loggingDir.isEmpty()) logPath = new File(loggingDir);
    }

    private class LogEntry implements Runnable {
        public final String deviceId;
        public final NodeManagementDetailedDiscoveryDataType detailedDiscovery;
        public final NodeManagementUseCaseDataType useCaseDiscovery;

        LogEntry(String deviceId,
            NodeManagementDetailedDiscoveryDataType detailedDiscovery,
            NodeManagementUseCaseDataType useCaseDiscovery
        ) {
            this.detailedDiscovery = detailedDiscovery;
            this.useCaseDiscovery = useCaseDiscovery;
            this.deviceId = deviceId;
        }

        @Override
        public void run() {
            File logPath = ensureLogDirExists();
            if (!enabled) return;
            File fileName = new File(logPath, String.format("discovery-%s.json", deviceId.replaceAll(BAD_FILENAME_CHARACTERS, "_")));
            try {
                MAPPER.writeValue(fileName, this);
            }
            catch (IOException e) {
                LOGGER.warn("Error while attempting to log discovery for device {}:", deviceId, e);
            }
        }
    }

    /**
     * Store a detailed discovery message for later logging (once the use case discovery is also done).
     * <p>
     * It is assumed that detailed discovery happens BEFORE use case discovery. If use case discovery never happens,
     * then the detailed discovery data will NOT be logged.
     * @param deviceId the device for which data was received
     * @param detailedDiscoveryData the data that was received
     */
    public void enqueueDetailedDiscovery(String deviceId, NodeManagementDetailedDiscoveryDataType detailedDiscoveryData) {
        if (!enabled) return;
        waitingDetailedDiscovery.put(deviceId, detailedDiscoveryData);
    }

    /**
     * Queue up a use case discovery message for logging ASAP (once the logger gets around to it). It is assumed that
     * detailed discovery has already happened and that the detailed discovery data was already queued up via
     * {@link #enqueueDetailedDiscovery(String, NodeManagementDetailedDiscoveryDataType)}.
     * @param deviceId the device for which data was received
     * @param useCaseData the data that was received
     */
    public void enqueueUseCaseDiscovery(String deviceId, NodeManagementUseCaseDataType useCaseData) {
        if (!enabled) return;
        NodeManagementDetailedDiscoveryDataType detailedDiscovery
            = waitingDetailedDiscovery.remove(deviceId);
        executor.submit(new LogEntry(deviceId, detailedDiscovery, useCaseData));
    }

    private File ensureLogDirExists() {
        File logPath = this.logPath;
        if (didMkdir || !enabled) return logPath;
        if (!(logPath.mkdirs() || logPath.isDirectory())) {
            String canonical;
            try {
                canonical = logPath.getCanonicalPath();
            }
            catch (IOException e) {
                canonical = "<could not normalize: " + logPath + ">";
            }
            LOGGER.warn("Could not create discovery logging directory {}", canonical);
            enabled = false;
        }
        if (this.logPath == logPath) didMkdir = true;
        return logPath;
    }

    public synchronized void setLogPath(File path) {
        didMkdir = false;
        logPath = path;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
