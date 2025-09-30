package com.ringcentral.definitions;


public class OutboundFaxesInfo {
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
     * List of recipient email addresses for outbound fax notifications.
     * Returned if specified, in both modes (advanced/basic). Applied in advanced
     * mode only
     */
    public String[] advancedEmailAddresses;
    /**
     * List of recipient phone numbers for outbound fax notifications.
     * Returned if specified, in both modes (advanced/basic). Applied in advanced
     * mode only
     */
    public String[] advancedSmsEmailAddresses;

    public OutboundFaxesInfo notifyByEmail(Boolean notifyByEmail) {
        this.notifyByEmail = notifyByEmail;
        return this;
    }

    public OutboundFaxesInfo notifyBySms(Boolean notifyBySms) {
        this.notifyBySms = notifyBySms;
        return this;
    }

    public OutboundFaxesInfo advancedSmsPhoneNumbers(String[] advancedSmsPhoneNumbers) {
        this.advancedSmsPhoneNumbers = advancedSmsPhoneNumbers;
        return this;
    }

    public OutboundFaxesInfo advancedEmailAddresses(String[] advancedEmailAddresses) {
        this.advancedEmailAddresses = advancedEmailAddresses;
        return this;
    }

    public OutboundFaxesInfo advancedSmsEmailAddresses(String[] advancedSmsEmailAddresses) {
        this.advancedSmsEmailAddresses = advancedSmsEmailAddresses;
        return this;
    }
}
