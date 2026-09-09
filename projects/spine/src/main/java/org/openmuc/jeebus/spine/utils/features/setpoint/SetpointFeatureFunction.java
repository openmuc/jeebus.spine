package org.openmuc.jeebus.spine.utils.features.setpoint;

import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.api.options.ReadListCmdOption;
import org.openmuc.jeebus.spine.api.options.WriteListCmdOption;
import org.openmuc.jeebus.spine.spi.function.ListFeatureFunctionTypeInfo;
import org.openmuc.jeebus.spine.spi.function.ReadAndWriteListFeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.SetpointDataElementsType;
import org.openmuc.jeebus.spine.xsd.v1.SetpointDataType;
import org.openmuc.jeebus.spine.xsd.v1.SetpointListDataSelectorsType;

import java.util.List;

public abstract class SetpointFeatureFunction <DATA, DATA_LIST, SELECTOR, ELEMENTS>
extends ReadAndWriteListFeatureFunction<
DATA,
DATA_LIST,
SELECTOR,
ELEMENTS,
ListFeatureFunctionTypeInfo<DATA, DATA_LIST, SELECTOR, ELEMENTS>
> {
    private boolean strictMode = false;
    private SetpointFeature setpointFeature;

    public SetpointFeatureFunction(
        String functionName,
        ListFeatureFunctionTypeInfo<DATA, DATA_LIST, SELECTOR, ELEMENTS> typeInfo
    ) {
        super(functionName, typeInfo);
        setReadable(true, true);
    }
    public boolean isStrictMode(){return strictMode; }
    public void setStrictMode(boolean strictMode) { this.strictMode = strictMode; }

    void setSetpointFeature(SetpointFeature feature){
        this.setpointFeature = feature;
    }

    SetpointFeature getFeature() { return setpointFeature; }

    protected abstract void validateWriteCmdFull(
        List<SetpointDataType> updateList,
        List<SetpointListDataSelectorsType> setpointListDataSelectorsTypes,
        SetpointDataElementsType setpointDataElementsType,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException;

    protected abstract void validateReadCmd(
        List<SetpointListDataSelectorsType> setpointListDataSelectorTypes,
        SetpointDataElementsType setpointDataElementsType,
        ReadListCmdOption readListCmdOption
    ) throws SpineException;
}

