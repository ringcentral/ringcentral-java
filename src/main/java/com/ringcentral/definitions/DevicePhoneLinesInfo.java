package com.ringcentral.definitions;


public class DevicePhoneLinesInfo {
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
     * Phone number information
     */
    public DevicePhoneNumberInfo phoneInfo;

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
