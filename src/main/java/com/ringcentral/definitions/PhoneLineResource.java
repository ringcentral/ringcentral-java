package com.ringcentral.definitions;


public class PhoneLineResource {
    /**
     * Enum: Unknown, Standalone, StandaloneFree, BlaPrimary, BlaSecondary, BLF
     */
    public String lineType;
    /**
     *
     */
    public PhoneNumberResourceIntId phoneInfo;
    /**
     *
     */
    public EmergencyAddress emergencyAddress;

    public PhoneLineResource lineType(String lineType) {
        this.lineType = lineType;
        return this;
    }

    public PhoneLineResource phoneInfo(PhoneNumberResourceIntId phoneInfo) {
        this.phoneInfo = phoneInfo;
        return this;
    }

    public PhoneLineResource emergencyAddress(EmergencyAddress emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

}
