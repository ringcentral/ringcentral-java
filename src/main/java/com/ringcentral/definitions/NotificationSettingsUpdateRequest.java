package com.ringcentral.definitions;


public class NotificationSettingsUpdateRequest {
    /**
     * List of notification recipient email addresses. Should not be empty
     * if &#039;includeManagers&#039; parameter is set to false
     */
    public String[] emailAddresses;
    /**
     * List of notification recipient email addresses
     */
    public String[] smsEmailAddresses;
    /**
     * Specifies notifications settings mode. If `true` then advanced
     * mode is on, it allows using different emails and/or phone numbers for
     * each notification type. If `false` then basic mode is on. Advanced mode
     * settings are returned in both modes, if specified once, but if basic mode
     * is switched on, they are not applied
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
    /**
     * Specifies if managers&#039; emails are included in the list of emails to
     * which notifications are sent. If not specified, then the value is `true`
     * Default: true
     */
    public Boolean includeManagers;

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

    public NotificationSettingsUpdateRequest includeManagers(Boolean includeManagers) {
        this.includeManagers = includeManagers;
        return this;
    }
}
