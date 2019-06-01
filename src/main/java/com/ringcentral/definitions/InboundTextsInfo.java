package com.ringcentral.definitions;


public class InboundTextsInfo {
    /**
     * Email notification flag
     */
    public Boolean notifyByEmail;
    /**
     * SMS notification flag
     */
    public Boolean notifyBySms;
    /**
     * List of recipient email addresses for inbound text message notifications. Returned if specified, in both modes (advanced/basic). Applied in advanced mode only
     */
    public String[] advancedEmailAddresses;
    /**
     * List of recipient phone numbers for inbound text message notifications. Returned if specified, in both modes (advanced/basic). Applied in advanced mode only
     */
    public String[] advancedSmsEmailAddresses;

    public InboundTextsInfo notifyByEmail(Boolean notifyByEmail) {
        this.notifyByEmail = notifyByEmail;
        return this;
    }

    public InboundTextsInfo notifyBySms(Boolean notifyBySms) {
        this.notifyBySms = notifyBySms;
        return this;
    }

    public InboundTextsInfo advancedEmailAddresses(String[] advancedEmailAddresses) {
        this.advancedEmailAddresses = advancedEmailAddresses;
        return this;
    }

    public InboundTextsInfo advancedSmsEmailAddresses(String[] advancedSmsEmailAddresses) {
        this.advancedSmsEmailAddresses = advancedSmsEmailAddresses;
        return this;
    }

}
