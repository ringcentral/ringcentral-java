package com.ringcentral.definitions;


public class MissedCallsInfo {
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
    /**
     * List of recipient email addresses for missed call notifications.
     * Returned if specified, in both modes (advanced/basic). Applied in advanced
     * mode only
     */
    public String[] advancedEmailAddresses;
    /**
     * List of recipient phone numbers for missed call notifications.
     * Returned if specified, in both modes (advanced/basic). Applied in advanced
     * mode only
     */
    public String[] advancedSmsEmailAddresses;

    public MissedCallsInfo notifyByEmail(Boolean notifyByEmail) {
        this.notifyByEmail = notifyByEmail;
        return this;
    }

    public MissedCallsInfo notifyBySms(Boolean notifyBySms) {
        this.notifyBySms = notifyBySms;
        return this;
    }

    public MissedCallsInfo advancedSmsPhoneNumbers(String[] advancedSmsPhoneNumbers) {
        this.advancedSmsPhoneNumbers = advancedSmsPhoneNumbers;
        return this;
    }

    public MissedCallsInfo advancedEmailAddresses(String[] advancedEmailAddresses) {
        this.advancedEmailAddresses = advancedEmailAddresses;
        return this;
    }

    public MissedCallsInfo advancedSmsEmailAddresses(String[] advancedSmsEmailAddresses) {
        this.advancedSmsEmailAddresses = advancedSmsEmailAddresses;
        return this;
    }
}
