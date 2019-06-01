package com.ringcentral.definitions;


public class PhoneLinesInfo {
    /**
     * Type of phone line
     * Enum: Standalone, StandaloneFree, BlaPrimary, BlaSecondary
     */
    public String lineType;
    /**
     * Phone number information
     */
    public PhoneNumberInfoIntId phoneInfo;

    public PhoneLinesInfo lineType(String lineType) {
        this.lineType = lineType;
        return this;
    }

    public PhoneLinesInfo phoneInfo(PhoneNumberInfoIntId phoneInfo) {
        this.phoneInfo = phoneInfo;
        return this;
    }

}
