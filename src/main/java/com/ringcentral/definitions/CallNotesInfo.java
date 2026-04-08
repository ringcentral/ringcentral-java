package com.ringcentral.definitions;

public class CallNotesInfo {
    /** */
    public Boolean notifyByEmail;

    public CallNotesInfo notifyByEmail(Boolean notifyByEmail) {
        this.notifyByEmail = notifyByEmail;
        return this;
    }

    /** */
    public Boolean notifyBySms;

    public CallNotesInfo notifyBySms(Boolean notifyBySms) {
        this.notifyBySms = notifyBySms;
        return this;
    }

    /** */
    public String[] advancedEmailAddresses;

    public CallNotesInfo advancedEmailAddresses(String[] advancedEmailAddresses) {
        this.advancedEmailAddresses = advancedEmailAddresses;
        return this;
    }

    /** */
    public String[] advancedSmsEmailAddresses;

    public CallNotesInfo advancedSmsEmailAddresses(String[] advancedSmsEmailAddresses) {
        this.advancedSmsEmailAddresses = advancedSmsEmailAddresses;
        return this;
    }
}
