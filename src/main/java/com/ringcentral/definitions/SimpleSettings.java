package com.ringcentral.definitions;


public class SimpleSettings {
    /**
     * Email notification flag
     */
    public Boolean notifyByEmail;
    /**
     * SMS notification flag
     */
    public Boolean notifyBySms;
    /**
     * The parameter contains the list of phone Numbers which should be used for SMS notifications sending (if advanced mode enabled)
     */
    public String[] advancedSmsPhoneNumbers;

    public SimpleSettings notifyByEmail(Boolean notifyByEmail) {
        this.notifyByEmail = notifyByEmail;
        return this;
    }

    public SimpleSettings notifyBySms(Boolean notifyBySms) {
        this.notifyBySms = notifyBySms;
        return this;
    }

    public SimpleSettings advancedSmsPhoneNumbers(String[] advancedSmsPhoneNumbers) {
        this.advancedSmsPhoneNumbers = advancedSmsPhoneNumbers;
        return this;
    }
}
