package com.ringcentral.definitions;


public class AutomaticLocationUpdatesPhoneLine {
    /**
     * Enum: Unknown, Standalone, StandaloneFree, BlaPrimary, BlaSecondary, BLF
     */
    public String lineType;
    /**
     *
     */
    public AutomaticLocationUpdatesPhoneNumberInfo phoneInfo;

    public AutomaticLocationUpdatesPhoneLine lineType(String lineType) {
        this.lineType = lineType;
        return this;
    }

    public AutomaticLocationUpdatesPhoneLine phoneInfo(AutomaticLocationUpdatesPhoneNumberInfo phoneInfo) {
        this.phoneInfo = phoneInfo;
        return this;
    }
}
