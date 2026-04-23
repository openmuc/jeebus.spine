/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.spi.function;

import org.openmuc.jeebus.spine.api.DataValidationException;
import org.openmuc.jeebus.spine.api.validation.DataValidation;
import org.openmuc.jeebus.spine.xsd.v1.FilterType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.List;

abstract class DataFeatureFunction<DATA, ELEMENTS, TYPE extends DataFeatureFunctionTypeInfo<DATA, ELEMENTS>>
    extends FeatureFunction implements Snapshottable {

    protected final static Logger logger = LoggerFactory.getLogger(
        DataFeatureFunction.class);

    private final TYPE typeInfo;

    private final List<DataValidation<DATA>> useCaseDataValidations = new ArrayList<>();

    public List<DataValidation<DATA>> getUseCaseDataValidations() {
        return useCaseDataValidations;
    }

    /**
     * Add a validation function to check use-case-specific rules and constraints.
     * <p>
     * In the case of composite data, the function <b>MUST</b> check only the data that actually belongs to
     * the use case, and consider all other data as valid.
     * @param useCaseDataValidation a function that checks data is valid for the calling use case
     */
    public void addUseCaseDataValidation(DataValidation<DATA> useCaseDataValidation) {
        this.useCaseDataValidations.add(useCaseDataValidation);
    }

    protected DataFeatureFunction(String functionName, TYPE typeInfo) {
        super(functionName);
        this.typeInfo = typeInfo;
    }

    /**
     * Validates the given data. Must be implemented by the specific Feature
     * Function.
     *
     * @param data
     *     the data to validate
     * @throws DataValidationException
     *     if the validation fails
     */
    protected abstract void validateData(DATA data) throws DataValidationException;

    /**
     * Validates given data. Calls idDescription validation (if identifiable),
     * Feature Function validation and Use Case Validation.
     *
     * @param data
     *     data to validate
     * @throws DataValidationException
     *     if the validation fails
     */
    void validateDataComplete(DATA data) throws DataValidationException {
        validateData(data);
        for (DataValidation<DATA> dataValidation : useCaseDataValidations) {
            dataValidation.validateData(data);
        }
    }

    void setElements(FilterType filter, ELEMENTS elements) {
        try {
            List<PropertyDescriptor> propertyDescriptors = List.of(
                Introspector.getBeanInfo(FilterType.class).getPropertyDescriptors()
            );
            for (PropertyDescriptor desc : propertyDescriptors) {
                if (desc.getPropertyType() == typeInfo.getElementsType()) {
                    desc.getWriteMethod().invoke(filter, elements);
                    break;
                }
            }
        }
        catch (ReflectiveOperationException | IntrospectionException e) {
            // Should never happen
            throw new RuntimeException(e);
        }
    }

    public TYPE getTypeInfo() {
        return typeInfo;
    }

    @Override
    public void close() {
        // do nothing - fine for ordinary data functions
    }
}
