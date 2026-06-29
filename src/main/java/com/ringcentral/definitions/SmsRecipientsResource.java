package com.ringcentral.definitions;

public class SmsRecipientsResource {
    /** */
    public SmsRecipient[] smsRecipients;

    public SmsRecipientsResource smsRecipients(SmsRecipient[] smsRecipients) {
        this.smsRecipients = smsRecipients;
        return this;
    }
}
