/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils;

import org.openmuc.jeebus.spine.xsd.v1.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import java.lang.reflect.InvocationTargetException;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.MILLIS;

public class SpineUtilities {
    private final static Logger LOGGER
        = LoggerFactory.getLogger(SpineUtilities.class);
    private static Integer threadCounter = 0;
    private static final Pattern CMD_REGEX
        = Pattern.compile("CmdType\\[([^=]+)=");
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter
        .ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'")
        .withZone(ZoneOffset.UTC);

    private SpineUtilities() {
        // prohibit instantiation
    }

    /**
     * Gets the default instance and returns
     * {@link DatatypeFactory#newDuration(String)} with the given String.
     */
    public static Duration toDuration(String what) {
        return DatatypeFactory
            .newDefaultInstance()
            .newDuration(what);
    }

    /**
     * Use this method to get the current timestamp in UTC. It is formatted with
     * {@link SpineUtilities#FORMATTER} using the pattern
     * {@code yyyy-MM-dd'T'HH:mm:ss'Z'}.
     *
     * @return the current timestamp
     */
    public static String getNowTimestamp() {
        return FORMATTER.format(Instant.now());
    }

    /**
     * @return a simplified String representation of the whole Datagram. The format
     * is "source command cmd -&gt; destination"
     */
    public static String simplifyDatagram(DatagramType what) {
        String from = what.getHeader().getAddressSource().getDevice();
        String to = what.getHeader().getAddressDestination().getDevice();
        String command = what.getHeader().getCmdClassifier().value();
        String cmd = simplifyCmds(what);

        return String.format("%s %s %s -> %s", from, command, cmd, to);
    }

    /**
     * @return a simplified String representation of the CmdTypes contained in the
     * given Datagram.
     */
    public static String simplifyCmds(DatagramType what) {
        String result = what
            .getPayload()
            .getCmd()
            .stream()
            .map(SpineUtilities::simplifyCmd)
            .collect(Collectors.joining());

        if (Objects.equals("function", result)) {
            result = what
                .getPayload()
                .getCmd()
                .stream()
                .map(CmdType::getFunction)
                .collect(Collectors.joining());
        }

        return result;
    }

    /**
     * @return a simplified String representation of the given CmdType
     */
    public static String simplifyCmd(CmdType what) {
        Matcher matcher = CMD_REGEX.matcher(what.toString());
        return matcher.find() ? matcher.group(1) : "";
    }

    public static String getThreadName(String useCaseName, String actor) {
        String result = String.join(
            ".",
            useCaseName,
            actor,
            threadCounter.toString()
        );
        ++threadCounter;

        return result;
    }

    public static CmdControlType getPartialCmdControl() {
        CmdControlType cmdControl = new CmdControlType();
        cmdControl.setPartial(new ElementTagType());
        return cmdControl;
    }

    public static CmdControlType getDeleteCmdControl() {
        CmdControlType cmdControl = new CmdControlType();
        cmdControl.setDelete(new ElementTagType());
        return cmdControl;
    }

    public static FeatureAddressType getAddressCopy(FeatureAddressType address) {
        FeatureAddressType addressCopy = new FeatureAddressType();
        addressCopy.setDevice(address.getDevice());
        addressCopy.getEntity().addAll(address.getEntity());
        addressCopy.setFeature(address.getFeature());
        return addressCopy;
    }

    public static EntityAddressType extractEntityAddress(EntityAddressType address) {
        return new EntityAddressType().withEntity(address.getEntity());
    }

    /**
     * @param duration
     *     A String representing a relative time (xs:duration)
     * @return the given time converted to relative milliseconds from now
     */
    public static Long durationToRelativeMilliseconds(String duration)
        throws IllegalArgumentException {
        // noinspection UseOfObsoleteDateTimeApi
        return DatatypeFactory
            .newDefaultInstance()
            .newDuration(duration)
            .getTimeInMillis(new Date());
    }

    /**
     * @param dateTime
     *     A String representing an absolute time (xs:dateTime)
     * @return the given time converted to relative milliseconds from now
     */
    public static Long dateTimeToRelativeMilliseconds(String dateTime)
        throws DateTimeParseException {
        return Instant
            .now()
            .until(Instant.parse(dateTime), MILLIS);
    }

    /**
     * @param time
     *     A String representing an absolute time (xs:dateTime) or a relative time
     *     (xs:duration)
     * @return the given time converted to relative milliseconds from now
     */
    public static Long toRelativeMilliseconds(String time)
        throws DateTimeParseException {
        try {
            return durationToRelativeMilliseconds(time);
        }
        catch (IllegalArgumentException e) {
            return dateTimeToRelativeMilliseconds(time);
        }
    }

    /**
     * Is entityAddressChild a direct child of entityAddressParent?
     *
     * @param entityAddressChild
     *     proposed child
     * @param entityAddressParent
     *     proposed parent
     * @return true if entityAddressChild is a direct child of entityAddressParent,
     * else false
     */
    public static boolean isDirectSubentity(
        EntityAddressType entityAddressChild,
        EntityAddressType entityAddressParent
    ) {
        if (entityAddressChild != null && entityAddressParent != null) {
            if (entityAddressChild.getEntity().size()
                == entityAddressParent.getEntity().size() + 1) {
                return entityAddressParent.getEntity()
                    .equals(entityAddressChild
                        .getEntity()
                        .subList(0, entityAddressParent.getEntity().size()));
            }
            LOGGER.debug(
                "Entity {} is not direct subentity of entity {}",
                entityAddressChild.getEntity(),
                entityAddressParent.getEntity()
            );
        }
        else {
            throw new IllegalArgumentException("entity addresses must not be null");
        }
        return false;
    }

    public static boolean isSubAddress(
        EntityAddressType parentAddress,
        FeatureAddressType childAddress
    ) {
        if (childAddress.getEntity().size() < parentAddress.getEntity().size()) {
            return false;
        }
        for (int level = 0; level < parentAddress.getEntity().size(); level++) {
            if (!parentAddress
                .getEntity()
                .get(level)
                .equals(childAddress.getEntity().get(level))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isFilterPartialSet(CmdType cmdType) {
        //        filterType Json message:
        //        "cmdControl": [{
        //            "partial": []
        //        }]
        for (FilterType filterType : cmdType.getFilter()) {
            if (filterType.getCmdControl() != null) {
                return filterType.getCmdControl().getPartial() != null;
            }
        }
        return false;
    }

    public static boolean isFilterDeleteSet(CmdType cmdType) {
        //        filterType Json message:
        //        "cmdControl": [{
        //            "delete": []
        //        }]
        for (FilterType filterType : cmdType.getFilter()) {
            if (filterType.getCmdControl() != null) {
                return filterType.getCmdControl().getDelete() != null;
            }
        }
        return false;
    }

    public static boolean supportsPartialRead(
        NodeManagementDetailedDiscoveryDataType detailedDiscoveryData,
        String featureName, String functionName
    ) {
        for (NodeManagementDetailedDiscoveryFeatureInformationType featureInformation : detailedDiscoveryData.getFeatureInformation()) {
            if (featureInformation
                .getDescription()
                .getFeatureType()
                .equals(featureName)) {
                for (FunctionPropertyType functionProperty : featureInformation
                    .getDescription()
                    .getSupportedFunction()) {
                    if (functionProperty.getFunction().equals(functionName)) {
                        if (functionProperty
                            .getPossibleOperations()
                            .getRead()
                            .getPartial() != null) {
                            return true;
                        }
                    }
                }
            }
        }
        LOGGER.debug(
            "Remote device {} supports full read only for feature {} function {}",
            detailedDiscoveryData
                .getDeviceInformation()
                .getDescription()
                .getDescription(), featureName,
            functionName
        );
        return false;
    }

    /**
     * Returns if a string is a valid value of a given enum. Only works if the enum
     * has a value parameter and a fromValue method, else throws a Runtime Exception.
     * The method is currently generated in the SPINE generated classes.
     *
     * @param clazz
     *     enum class
     * @param name
     *     value name
     * @param <E>
     *     extends Enum
     * @return true if is valid enum value of given enum class
     */
    public static <E extends Enum<E>> boolean isValidEnumValue(
        Class<E> clazz,
        String name
    ) {
        try {
            clazz.getMethod("fromValue", String.class).invoke(null, name);
        }
        catch (InvocationTargetException e) {
            return false;
        }
        catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    /**
     * Checks if a given timestamp is in given interval.
     *
     * @param timestampString
     *     timestamp as string
     * @param interval
     *     interval to check
     * @return true if in interval or if interval is null, else false
     */
    public static boolean timestampIsInInterval(
        String timestampString,
        TimestampIntervalType interval
    ) {
        if (interval == null) {
            return true;
        }
        else if (timestampString == null) {
            return false;
        }

        long startTime = Instant.parse(interval.getStartTime()).getEpochSecond();
        long endTime = Instant.parse(interval.getEndTime()).getEpochSecond();
        long timestamp = Instant.parse(timestampString).getEpochSecond();

        return (startTime <= timestamp) && (timestamp <= endTime);
    }
}
