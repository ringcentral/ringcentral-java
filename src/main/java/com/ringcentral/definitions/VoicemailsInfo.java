package com.ringcentral.definitions;


public class VoicemailsInfo {
    /**
     * Email notification flag
     */
    public Boolean notifyByEmail;
    /**
     * SMS notification flag
     */
    public Boolean notifyBySms;
    /**
     * List of recipient email addresses for voicemail notifications. Returned if specified, in both modes (advanced/basic). Applied in advanced mode only
     */
    public String[] advancedEmailAddresses;
    /**
     * List of recipient phone numbers for voicemail notifications. Returned if specified, in both modes (advanced/basic). Applied in advanced mode only
     */
    public String[] advancedSmsEmailAddresses;
    /**
     * Indicates whether voicemail should be attached to email
     */
    public Boolean includeAttachment;
    /**
     * Indicates whether email should be automatically marked as read
     */
    public Boolean markAsRead;

    public VoicemailsInfo notifyByEmail(Boolean notifyByEmail) {
        this.notifyByEmail = notifyByEmail;
        return this;
    }

    public VoicemailsInfo notifyBySms(Boolean notifyBySms) {
        this.notifyBySms = notifyBySms;
        return this;
    }

    public VoicemailsInfo advancedEmailAddresses(String[] advancedEmailAddresses) {
        this.advancedEmailAddresses = advancedEmailAddresses;
        return this;
    }

    public VoicemailsInfo advancedSmsEmailAddresses(String[] advancedSmsEmailAddresses) {
        this.advancedSmsEmailAddresses = advancedSmsEmailAddresses;
        return this;
    }

    public VoicemailsInfo includeAttachment(Boolean includeAttachment) {
        this.includeAttachment = includeAttachment;
        return this;
    }

    public VoicemailsInfo markAsRead(Boolean markAsRead) {
        this.markAsRead = markAsRead;
        return this;
    }

}
