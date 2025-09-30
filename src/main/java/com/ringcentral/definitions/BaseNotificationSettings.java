package com.ringcentral.definitions;


public class BaseNotificationSettings {
    /**
     * Canonical URI of notifications settings resource
     * Format: uri
     */
    public String uri;
    /**
     * The parameter contains the list of phone Numbers which should be used for SMS notifications sending
     * (if advanced mode disabled)
     */
    public String[] smsPhoneNumbers;
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

    public BaseNotificationSettings uri(String uri) {
        this.uri = uri;
        return this;
    }

    public BaseNotificationSettings smsPhoneNumbers(String[] smsPhoneNumbers) {
        this.smsPhoneNumbers = smsPhoneNumbers;
        return this;
    }

    public BaseNotificationSettings advancedMode(Boolean advancedMode) {
        this.advancedMode = advancedMode;
        return this;
    }

    public BaseNotificationSettings voicemails(VoicemailsInfo voicemails) {
        this.voicemails = voicemails;
        return this;
    }

    public BaseNotificationSettings inboundFaxes(InboundFaxesInfo inboundFaxes) {
        this.inboundFaxes = inboundFaxes;
        return this;
    }

    public BaseNotificationSettings outboundFaxes(OutboundFaxesInfo outboundFaxes) {
        this.outboundFaxes = outboundFaxes;
        return this;
    }

    public BaseNotificationSettings inboundTexts(InboundTextsInfo inboundTexts) {
        this.inboundTexts = inboundTexts;
        return this;
    }

    public BaseNotificationSettings missedCalls(MissedCallsInfo missedCalls) {
        this.missedCalls = missedCalls;
        return this;
    }
}
