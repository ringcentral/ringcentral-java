package com.ringcentral.definitions;


public class DeviceDefinition {
    /**
     * Device type. Only &quot;OtherPhone&quot; and &quot;WebRTC&quot; device types are supported at the moment
     * Required
     * Enum: OtherPhone, WebRTC
     */
    public String type;
    /**
     * Only &quot;address&quot; is supported at the moment
     * Required
     */
    public DeviceDefinitionEmergency emergency;
    /**
     * To be used to assign a number by id
     * Required
     */
    public DeviceDefinitionPhoneInfo phoneInfo;

    public DeviceDefinition type(String type) {
        this.type = type;
        return this;
    }

    public DeviceDefinition emergency(DeviceDefinitionEmergency emergency) {
        this.emergency = emergency;
        return this;
    }

    public DeviceDefinition phoneInfo(DeviceDefinitionPhoneInfo phoneInfo) {
        this.phoneInfo = phoneInfo;
        return this;
    }
}
