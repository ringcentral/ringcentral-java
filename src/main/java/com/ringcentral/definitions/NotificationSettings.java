package com.ringcentral.definitions;


public class NotificationSettings {
    /**
     * Canonical URI of notifications settings resource
     */
    public String uri;
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

    public NotificationSettings uri(String uri) {
        this.uri = uri;
        return this;
    }

    public NotificationSettings emailAddresses(String[] emailAddresses) {
        this.emailAddresses = emailAddresses;
        return this;
    }

    public NotificationSettings smsEmailAddresses(String[] smsEmailAddresses) {
        this.smsEmailAddresses = smsEmailAddresses;
        return this;
    }

    public NotificationSettings advancedMode(Boolean advancedMode) {
        this.advancedMode = advancedMode;
        return this;
    }

    public NotificationSettings voicemails(VoicemailsInfo voicemails) {
        this.voicemails = voicemails;
        return this;
    }

    public NotificationSettings inboundFaxes(InboundFaxesInfo inboundFaxes) {
        this.inboundFaxes = inboundFaxes;
        return this;
    }

    public NotificationSettings outboundFaxes(OutboundFaxesInfo outboundFaxes) {
        this.outboundFaxes = outboundFaxes;
        return this;
    }

    public NotificationSettings inboundTexts(InboundTextsInfo inboundTexts) {
        this.inboundTexts = inboundTexts;
        return this;
    }

    public NotificationSettings missedCalls(MissedCallsInfo missedCalls) {
        this.missedCalls = missedCalls;
        return this;
    }

}
