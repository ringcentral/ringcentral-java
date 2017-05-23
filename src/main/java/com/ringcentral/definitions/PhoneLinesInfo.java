package com.ringcentral.definitions;

public class PhoneLinesInfo {
    // Type of phone line
    public String lineType;
    // Phone number information
    public PhoneLinesInfo_PhoneNumberInfo phoneInfo;

    public PhoneLinesInfo lineType(String lineType) {
        this.lineType = lineType;
        return this;
    }

    public PhoneLinesInfo phoneInfo(PhoneLinesInfo_PhoneNumberInfo phoneInfo) {
        this.phoneInfo = phoneInfo;
        return this;
    }
}
