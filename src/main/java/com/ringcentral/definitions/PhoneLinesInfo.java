package com.ringcentral.definitions;


public class PhoneLinesInfo {
    /**
     * Internal identifier of a phone line
     */
    public String id;
    /**
     * The type of phone line
     * Enum: Unknown, Standalone, StandaloneFree, BlaPrimary, BlaSecondary
     */
    public String lineType;
    /**
     *
     */
    public PhoneNumberInfoIntId phoneInfo;
    /**
     *
     */
    public EmergencyAddress emergencyAddress;

    public PhoneLinesInfo id(String id) {
        this.id = id;
        return this;
    }

    public PhoneLinesInfo lineType(String lineType) {
        this.lineType = lineType;
        return this;
    }

    public PhoneLinesInfo phoneInfo(PhoneNumberInfoIntId phoneInfo) {
        this.phoneInfo = phoneInfo;
        return this;
    }

    public PhoneLinesInfo emergencyAddress(EmergencyAddress emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }
}
