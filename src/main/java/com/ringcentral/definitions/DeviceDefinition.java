package com.ringcentral.definitions;

public class DeviceDefinition {
    /**
     * Device type. Only &quot;OtherPhone&quot; and &quot;WebRTC&quot; device types are supported at
     * the moment Required Enum: OtherPhone, WebRTC
     */
    public String type;

    public DeviceDefinition type(String type) {
        this.type = type;
        return this;
    }

    /** Required */
    public DeviceDefinitionEmergency emergency;

    public DeviceDefinition emergency(DeviceDefinitionEmergency emergency) {
        this.emergency = emergency;
        return this;
    }

    /** Assign a specific phone number Required */
    public DeviceDefinitionPhoneInfo phoneInfo;

    public DeviceDefinition phoneInfo(DeviceDefinitionPhoneInfo phoneInfo) {
        this.phoneInfo = phoneInfo;
        return this;
    }

    /** The option that indicates whether Contact Center Phone Line should be created or not */
    public Boolean contactCenterPhoneLine;

    public DeviceDefinition contactCenterPhoneLine(Boolean contactCenterPhoneLine) {
        this.contactCenterPhoneLine = contactCenterPhoneLine;
        return this;
    }
}
