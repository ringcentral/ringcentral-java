package com.ringcentral.definitions;

public class NotificationSettings {
    /** Canonical URI of notifications settings resource Format: uri */
    public String uri;

    public NotificationSettings uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * The parameter contains the list of phone Numbers which should be used for SMS notifications
     * sending (if advanced mode disabled)
     */
    public String[] smsPhoneNumbers;

    public NotificationSettings smsPhoneNumbers(String[] smsPhoneNumbers) {
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

    public NotificationSettings advancedMode(Boolean advancedMode) {
        this.advancedMode = advancedMode;
        return this;
    }

    /** */
    public VoicemailsInfo voicemails;

    public NotificationSettings voicemails(VoicemailsInfo voicemails) {
        this.voicemails = voicemails;
        return this;
    }

    /** */
    public InboundFaxesInfo inboundFaxes;

    public NotificationSettings inboundFaxes(InboundFaxesInfo inboundFaxes) {
        this.inboundFaxes = inboundFaxes;
        return this;
    }

    /** */
    public OutboundFaxesInfo outboundFaxes;

    public NotificationSettings outboundFaxes(OutboundFaxesInfo outboundFaxes) {
        this.outboundFaxes = outboundFaxes;
        return this;
    }

    /** */
    public InboundTextsInfo inboundTexts;

    public NotificationSettings inboundTexts(InboundTextsInfo inboundTexts) {
        this.inboundTexts = inboundTexts;
        return this;
    }

    /** */
    public MissedCallsInfo missedCalls;

    public NotificationSettings missedCalls(MissedCallsInfo missedCalls) {
        this.missedCalls = missedCalls;
        return this;
    }

    /**
     * List of extensions specified as email notification recipients. Returned only for call queues
     * where queue managers are assigned as user extensions.
     */
    public EmailRecipientInfo[] emailRecipients;

    public NotificationSettings emailRecipients(EmailRecipientInfo[] emailRecipients) {
        this.emailRecipients = emailRecipients;
        return this;
    }

    /** List of notification recipient email addresses */
    public String[] emailAddresses;

    public NotificationSettings emailAddresses(String[] emailAddresses) {
        this.emailAddresses = emailAddresses;
        return this;
    }

    /**
     * Specifies if managers&#039; emails are included in the list of emails to which notifications
     * are sent
     */
    public Boolean includeManagers;

    public NotificationSettings includeManagers(Boolean includeManagers) {
        this.includeManagers = includeManagers;
        return this;
    }

    /**
     * Specifies if sms recipients&#039; emails are included in the list of emails to which
     * notifications are sent
     */
    public Boolean includeSmsRecipients;

    public NotificationSettings includeSmsRecipients(Boolean includeSmsRecipients) {
        this.includeSmsRecipients = includeSmsRecipients;
        return this;
    }

    /** List of sms recipients specified for call queue. Returned only for call queue extension */
    public EmailRecipientInfo[] smsRecipients;

    public NotificationSettings smsRecipients(EmailRecipientInfo[] smsRecipients) {
        this.smsRecipients = smsRecipients;
        return this;
    }

    /** List of notification recipient email addresses */
    public String[] smsEmailAddresses;

    public NotificationSettings smsEmailAddresses(String[] smsEmailAddresses) {
        this.smsEmailAddresses = smsEmailAddresses;
        return this;
    }

    /** */
    public CallNotesInfo callNotes;

    public NotificationSettings callNotes(CallNotesInfo callNotes) {
        this.callNotes = callNotes;
        return this;
    }
}
