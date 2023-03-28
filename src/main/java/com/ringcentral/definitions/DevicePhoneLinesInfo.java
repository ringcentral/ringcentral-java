package com.ringcentral.definitions;


public class DevicePhoneLinesInfo {
    /**
     * Internal identifier of a phone line
     */
    public String id;
    /**
     * Type of phone line
     * Enum: Standalone, StandaloneFree, BlaPrimary, BlaSecondary
     */
    public String lineType;
    /**
     *
     */
    public DevicePhoneLinesEmergencyAddressInfo emergencyAddress;
    /**
     *
     */
    public DevicePhoneNumberInfo phoneInfo;

    public DevicePhoneLinesInfo id(String id) {
        this.id = id;
        return this;
    }

    public DevicePhoneLinesInfo lineType(String lineType) {
        this.lineType = lineType;
        return this;
    }

    public DevicePhoneLinesInfo emergencyAddress(DevicePhoneLinesEmergencyAddressInfo emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    public DevicePhoneLinesInfo phoneInfo(DevicePhoneNumberInfo phoneInfo) {
        this.phoneInfo = phoneInfo;
        return this;
    }
}
