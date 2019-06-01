package com.ringcentral.definitions;


public class NotificationSettingsUpdateRequest {
    /**
     * List of notification recipient email addresses
     */
    public String[] emailAddresses;
    /**
     * List of notification recipient email addresses
     */
    public String[] smsEmailAddresses;
    /**
     * Specifies notifications settings mode. If 'True' then advanced mode is on, it allows using different emails and/or phone numbers for each notification type. If 'False' then basic mode is on. Advanced mode settings are returned in both modes, if specified once, but if basic mode is switched on, they are not applied
     */
    public Boolean advancedMode;
    /**
     *
     */
    public VoicemailsInfo voicemails;
    /**
     *
     */
    public InboundFaxesInfo inboundFaxes;
    /**
     *
     */
    public OutboundFaxesInfo outboundFaxes;
    /**
     *
     */
    public InboundTextsInfo inboundTexts;
    /**
     *
     */
    public MissedCallsInfo missedCalls;

    public NotificationSettingsUpdateRequest emailAddresses(String[] emailAddresses) {
        this.emailAddresses = emailAddresses;
        return this;
    }

    public NotificationSettingsUpdateRequest smsEmailAddresses(String[] smsEmailAddresses) {
        this.smsEmailAddresses = smsEmailAddresses;
        return this;
    }

    public NotificationSettingsUpdateRequest advancedMode(Boolean advancedMode) {
        this.advancedMode = advancedMode;
        return this;
    }

    public NotificationSettingsUpdateRequest voicemails(VoicemailsInfo voicemails) {
        this.voicemails = voicemails;
        return this;
    }

    public NotificationSettingsUpdateRequest inboundFaxes(InboundFaxesInfo inboundFaxes) {
        this.inboundFaxes = inboundFaxes;
        return this;
    }

    public NotificationSettingsUpdateRequest outboundFaxes(OutboundFaxesInfo outboundFaxes) {
        this.outboundFaxes = outboundFaxes;
        return this;
    }

    public NotificationSettingsUpdateRequest inboundTexts(InboundTextsInfo inboundTexts) {
        this.inboundTexts = inboundTexts;
        return this;
    }

    public NotificationSettingsUpdateRequest missedCalls(MissedCallsInfo missedCalls) {
        this.missedCalls = missedCalls;
        return this;
    }

}
