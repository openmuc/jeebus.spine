/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.devicediagnosis;

import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.spi.function.StandardFunctionType;
import org.openmuc.jeebus.spine.utils.NamedThreadFactory;
import org.openmuc.jeebus.spine.xsd.v1.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import static org.openmuc.jeebus.spine.utils.SpineUtilities.getNowTimestamp;

@StandardFunctionType(
        type = FunctionEnumType.DEVICE_DIAGNOSIS_HEARTBEAT_DATA,
        featureType = FeatureTypeEnumType.DEVICE_DIAGNOSIS)
public class HeartbeatDataFunction extends FeatureFunction {
    private static final Logger log
        = LoggerFactory.getLogger(HeartbeatDataFunction.class);
    private final NamedThreadFactory namedThreadFactory = new NamedThreadFactory(
        "jEEBus HeartBeatDataFunction "
    );
    private final ScheduledExecutorService executorService
        = Executors.newSingleThreadScheduledExecutor(namedThreadFactory);
    private Duration timeout;
    private long timeoutSeconds;
    private BigInteger heartbeatCounter = BigInteger.ZERO;
    private ScheduledFuture<?> currentFuture;

    public static final long DEFAULT_TIMEOUT_SECONDS = 60;
    private static final long SHUTDOWN_WAIT_SECONDS = 5;

    public HeartbeatDataFunction() {
        super(FunctionEnumType.DEVICE_DIAGNOSIS_HEARTBEAT_DATA.value());
        setTimeoutSeconds(DEFAULT_TIMEOUT_SECONDS);  // default timeout

        setReadable(true, false);
    }

    @Override
    public CmdType read(FilterType filter, FeatureAddressType featureAddress) {
        CmdType reply = new CmdType();
        DeviceDiagnosisHeartbeatDataType heartbeatData
            = new DeviceDiagnosisHeartbeatDataType();
        heartbeatData.setHeartbeatTimeout(timeout);
        heartbeatData.setHeartbeatCounter(heartbeatCounter);
        heartbeatData.setTimestamp(getNowTimestamp());
        reply.setDeviceDiagnosisHeartbeatData(heartbeatData);
        return reply;
    }

    @Override
    public SpineAcknowledgment write(
        CmdType cmdType,
        FeatureAddressType featureAddressType
    ) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        throw new UnsupportedOperationException();
    }

    public ScheduledFuture<?> startHeartbeat() {
        increaseCounterAndNotifySubscribers();
        return currentFuture;
    }

    private void resetHeartbeat() {
        if (executorService.isShutdown()) return;
        if (currentFuture != null && !currentFuture.isDone()) currentFuture.cancel(false);
        try {
            currentFuture = executorService.schedule(
                    this::increaseCounterAndNotifySubscribers,
                    timeoutSeconds,
                    TimeUnit.SECONDS
            );
        }
        catch (RejectedExecutionException e) {
            // executor was shut down concurrently (close()) - nothing left to schedule
            log.debug("Heartbeat not rescheduled: executor is shut down");
        }
    }

    public void increaseCounterAndNotifySubscribers() {
        resetHeartbeat();
        sendHeartbeat();
    }

    public void sendHeartbeat() {
        if (feature != null) {
            heartbeatCounter = heartbeatCounter.add(BigInteger.ONE);
            feature.notifySubscribers(
                FunctionEnumType.DEVICE_DIAGNOSIS_HEARTBEAT_DATA,
                null
            );
        }
    }

    /**
     * Stops the heartbeat instantly. A graceful {@code shutdown()} would keep the already scheduled
     * (delayed) heartbeat task alive, because a ScheduledThreadPoolExecutor by default still runs
     * delayed tasks after shutdown - so waiting for termination blocked for up to one heartbeat
     * period (about 60 s). The pending task is therefore cancelled and the executor is shut down
     * with {@code shutdownNow()}; only a currently running notification is waited for, briefly.
     */
    public void shutdownExecutor() {
        ScheduledFuture<?> future = currentFuture;
        if (future != null) {
            future.cancel(false);
        }
        executorService.shutdownNow();
        try {
            if (!executorService.awaitTermination(SHUTDOWN_WAIT_SECONDS, TimeUnit.SECONDS)) {
                log.error("Pool did not terminate");
            }
        }
        catch (InterruptedException ie) {
            // (Re-)Cancel if current thread also interrupted
            executorService.shutdownNow();
            // Preserve interrupt status
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void close() {
        shutdownExecutor();
    }

    public void setTimeoutSeconds(long timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        timeout = DatatypeFactory
                .newDefaultInstance()
                .newDuration(
                        true,
                        null,
                        null,
                        null,
                        null,
                        null,
                        new BigDecimal(timeoutSeconds)
                );
        resetHeartbeat();
    }
}
