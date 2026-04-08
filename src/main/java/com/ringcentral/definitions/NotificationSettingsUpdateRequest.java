package com.ringcentral.definitions;

public class NotificationSettingsUpdateRequest {
    /** Canonical URI of notifications settings resource Format: uri */
    public String uri;

    public NotificationSettingsUpdateRequest uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * The parameter contains the list of phone Numbers which should be used for SMS notifications
     * sending (if advanced mode disabled)
     */
    public String[] smsPhoneNumbers;

    public NotificationSettingsUpdateRequest smsPhoneNumbers(String[] smsPhoneNumbers) {
        this.smsPhoneNumbers = smsPhoneNumbers;
        return this;
    }

    /**
     * Specifies notifications settings mode. If `true` then advanced mode is on, it allows using
     * different emails and/or phone numbers for each notification type. If `false` then basic mode
     * is on. Advanced mode settings are returned in both modes, if specified once, but if basic
     * mode is switched on, they are not applied
     */
    public Boolean advancedMode;

    public NotificationSettingsUpdateRequest advancedMode(Boolean advancedMode) {
        this.advancedMode = advancedMode;
        return this;
    }

    /** */
    public VoicemailsInfo voicemails;

    public NotificationSettingsUpdateRequest voicemails(VoicemailsInfo voicemails) {
        this.voicemails = voicemails;
        return this;
    }

    /** */
    public InboundFaxesInfo inboundFaxes;

    public NotificationSettingsUpdateRequest inboundFaxes(InboundFaxesInfo inboundFaxes) {
        this.inboundFaxes = inboundFaxes;
        return this;
    }

    /** */
    public OutboundFaxesInfo outboundFaxes;

    public NotificationSettingsUpdateRequest outboundFaxes(OutboundFaxesInfo outboundFaxes) {
        this.outboundFaxes = outboundFaxes;
        return this;
    }

    /** */
    public InboundTextsInfo inboundTexts;

    public NotificationSettingsUpdateRequest inboundTexts(InboundTextsInfo inboundTexts) {
        this.inboundTexts = inboundTexts;
        return this;
    }

    /** */
    public MissedCallsInfo missedCalls;

    public NotificationSettingsUpdateRequest missedCalls(MissedCallsInfo missedCalls) {
        this.missedCalls = missedCalls;
        return this;
    }

    /**
     * List of notification recipient email addresses. Should not be empty if
     * &#039;includeManagers&#039; parameter is set to false
     */
    public String[] emailAddresses;

    public NotificationSettingsUpdateRequest emailAddresses(String[] emailAddresses) {
        this.emailAddresses = emailAddresses;
        return this;
    }

    /** List of notification recipient email addresses */
    public String[] smsEmailAddresses;

    public NotificationSettingsUpdateRequest smsEmailAddresses(String[] smsEmailAddresses) {
        this.smsEmailAddresses = smsEmailAddresses;
        return this;
    }

    /**
     * Specifies if managers&#039; emails are included in the list of emails to which notifications
     * are sent. If not specified, then the value is `true` Default: true
     */
    public Boolean includeManagers;

    public NotificationSettingsUpdateRequest includeManagers(Boolean includeManagers) {
        this.includeManagers = includeManagers;
        return this;
    }

    /** */
    public CallNotesInfo callNotes;

    public NotificationSettingsUpdateRequest callNotes(CallNotesInfo callNotes) {
        this.callNotes = callNotes;
        return this;
    }
}
