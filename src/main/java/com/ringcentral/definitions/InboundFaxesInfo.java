package com.ringcentral.definitions;


public class InboundFaxesInfo {
    /**
     * Email notification flag
     */
    public Boolean notifyByEmail;
    /**
     * SMS notification flag
     */
    public Boolean notifyBySms;
    /**
     * List of recipient email addresses for inbound fax notifications. Returned if specified, in both modes (advanced/basic). Applied in advanced mode only
     */
    public String[] advancedEmailAddresses;
    /**
     * List of recipient phone numbers for inbound fax notifications. Returned if specified, in both modes (advanced/basic). Applied in advanced mode only
     */
    public String[] advancedSmsEmailAddresses;
    /**
     * Indicates whether fax should be attached to email
     */
    public Boolean includeAttachment;
    /**
     * Indicates whether email should be automatically marked as read
     */
    public Boolean markAsRead;

    public InboundFaxesInfo notifyByEmail(Boolean notifyByEmail) {
        this.notifyByEmail = notifyByEmail;
        return this;
    }

    public InboundFaxesInfo notifyBySms(Boolean notifyBySms) {
        this.notifyBySms = notifyBySms;
        return this;
    }

    public InboundFaxesInfo advancedEmailAddresses(String[] advancedEmailAddresses) {
        this.advancedEmailAddresses = advancedEmailAddresses;
        return this;
    }

    public InboundFaxesInfo advancedSmsEmailAddresses(String[] advancedSmsEmailAddresses) {
        this.advancedSmsEmailAddresses = advancedSmsEmailAddresses;
        return this;
    }

    public InboundFaxesInfo includeAttachment(Boolean includeAttachment) {
        this.includeAttachment = includeAttachment;
        return this;
    }

    public InboundFaxesInfo markAsRead(Boolean markAsRead) {
        this.markAsRead = markAsRead;
        return this;
    }

}
