package com.ringcentral.definitions;


public class SmsOptFailureRecord {
    /**
     * The wildcard (&#039;*&#039;) indicating that all account numbers should be opted out or opted in
     * Required
     * Example: +16501234567
     * Enum: *
     */
    public String from;
    /**
     * Phone number in e.164 format (with &#039;+&#039; prefix)
     * Required
     * Example: +16501234567
     */
    public String to;
    /**
     * Consent status of a recipient&#039;s phone number:
     * - `OptOut` - The number is opted out of receiving SMS.
     * - `OptIn` - The number is opted in to receiving SMS (if it was previously opted out).
     * Required
     * Example: OptOut
     * Enum: OptOut, OptIn
     */
    public String optStatus;
    /**
     * The source of the consent record
     * Required
     * Enum: Recipient, Api, Upstream, Carrier
     */
    public String source;
    /**
     * Required
     */
    public ApiError error;

    public SmsOptFailureRecord from(String from) {
        this.from = from;
        return this;
    }

    public SmsOptFailureRecord to(String to) {
        this.to = to;
        return this;
    }

    public SmsOptFailureRecord optStatus(String optStatus) {
        this.optStatus = optStatus;
        return this;
    }

    public SmsOptFailureRecord source(String source) {
        this.source = source;
        return this;
    }

    public SmsOptFailureRecord error(ApiError error) {
        this.error = error;
        return this;
    }
}
