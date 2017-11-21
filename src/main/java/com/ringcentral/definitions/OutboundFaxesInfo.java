package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class OutboundFaxesInfo
{
    // Email notification flag
    public Boolean notifyByEmail;
    public OutboundFaxesInfo notifyByEmail(Boolean notifyByEmail) {
        this.notifyByEmail = notifyByEmail;
        return this;
    }
    // SMS notification flag
    public Boolean notifyBySms;
    public OutboundFaxesInfo notifyBySms(Boolean notifyBySms) {
        this.notifyBySms = notifyBySms;
        return this;
    }
    // List of recipient email addresses for outbound fax notifications. Returned if specified, in both modes (advanced/basic). Applied in advanced mode only
    public String[] advancedEmailAddresses;
    public OutboundFaxesInfo advancedEmailAddresses(String[] advancedEmailAddresses) {
        this.advancedEmailAddresses = advancedEmailAddresses;
        return this;
    }
    // List of recipient phone numbers for outbound fax notifications. Returned if specified, in both modes (advanced/basic). Applied in advanced mode only
    public String[] advancedSmsEmailAddresses;
    public OutboundFaxesInfo advancedSmsEmailAddresses(String[] advancedSmsEmailAddresses) {
        this.advancedSmsEmailAddresses = advancedSmsEmailAddresses;
        return this;
    }
}
