package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class InboundFaxesInfo
{
    // Email notification flag
    public Boolean notifyByEmail;
    public InboundFaxesInfo notifyByEmail(Boolean notifyByEmail) {
        this.notifyByEmail = notifyByEmail;
        return this;
    }
    // SMS notification flag
    public Boolean notifyBySms;
    public InboundFaxesInfo notifyBySms(Boolean notifyBySms) {
        this.notifyBySms = notifyBySms;
        return this;
    }
    // List of recipient email addresses for inbound fax notifications. Returned if specified, in both modes (advanced/basic). Applied in advanced mode only
    public String[] advancedEmailAddresses;
    public InboundFaxesInfo advancedEmailAddresses(String[] advancedEmailAddresses) {
        this.advancedEmailAddresses = advancedEmailAddresses;
        return this;
    }
    // List of recipient phone numbers for inbound fax notifications. Returned if specified, in both modes (advanced/basic). Applied in advanced mode only
    public String[] advancedSmsEmailAddresses;
    public InboundFaxesInfo advancedSmsEmailAddresses(String[] advancedSmsEmailAddresses) {
        this.advancedSmsEmailAddresses = advancedSmsEmailAddresses;
        return this;
    }
    // Indicates whether fax should be attached to email
    public Boolean includeAttachment;
    public InboundFaxesInfo includeAttachment(Boolean includeAttachment) {
        this.includeAttachment = includeAttachment;
        return this;
    }
    // Indicates whether email should be automatically marked as read
    public Boolean markAsRead;
    public InboundFaxesInfo markAsRead(Boolean markAsRead) {
        this.markAsRead = markAsRead;
        return this;
    }
}
