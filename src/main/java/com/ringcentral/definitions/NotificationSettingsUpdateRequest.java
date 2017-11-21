package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class NotificationSettingsUpdateRequest
{
    // List of notification recipient email addresses
    public String[] emailAddresses;
    public NotificationSettingsUpdateRequest emailAddresses(String[] emailAddresses) {
        this.emailAddresses = emailAddresses;
        return this;
    }
    // List of notification recipient email addresses
    public String[] smsEmailAddresses;
    public NotificationSettingsUpdateRequest smsEmailAddresses(String[] smsEmailAddresses) {
        this.smsEmailAddresses = smsEmailAddresses;
        return this;
    }
    // Specifies notifications settings mode. If 'True' then advanced mode is on, it allows using different emails and/or phone numbers for each notification type. If 'False' then basic mode is on. Advanced mode settings are returned in both modes, if specified once, but if basic mode is switched on, they are not applied
    public Boolean advancedMode;
    public NotificationSettingsUpdateRequest advancedMode(Boolean advancedMode) {
        this.advancedMode = advancedMode;
        return this;
    }
    //
    public VoicemailsInfo voicemails;
    public NotificationSettingsUpdateRequest voicemails(VoicemailsInfo voicemails) {
        this.voicemails = voicemails;
        return this;
    }
    //
    public InboundFaxesInfo inboundFaxes;
    public NotificationSettingsUpdateRequest inboundFaxes(InboundFaxesInfo inboundFaxes) {
        this.inboundFaxes = inboundFaxes;
        return this;
    }
    //
    public OutboundFaxesInfo outboundFaxes;
    public NotificationSettingsUpdateRequest outboundFaxes(OutboundFaxesInfo outboundFaxes) {
        this.outboundFaxes = outboundFaxes;
        return this;
    }
    //
    public InboundTextsInfo inboundTexts;
    public NotificationSettingsUpdateRequest inboundTexts(InboundTextsInfo inboundTexts) {
        this.inboundTexts = inboundTexts;
        return this;
    }
    //
    public MissedCallsInfo missedCalls;
    public NotificationSettingsUpdateRequest missedCalls(MissedCallsInfo missedCalls) {
        this.missedCalls = missedCalls;
        return this;
    }
}
