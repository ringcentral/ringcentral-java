package com.ringcentral.definitions;


public class SmsOptRecord {
    /**
     * The wildcard meaning that all account numbers should be opted out/in
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
     * Opt status of a recipient&#039;s phone number:
     * - `OptOut` - the number is opted out for SMS;
     * - `OptIn` - the number is opted in for SMS (if it was previously opted-out).
     * Required
     * Example: OptOut
     * Enum: OptOut, OptIn
     */
    public String optStatus;
    /**
     * The source of opt record
     * Required
     * Enum: Recipient, Api, Upstream, Carrier
     */
    public String source;
    /**
     * The time when the record was last updated
     * Required
     * Format: date-time
     */
    public String lastModifiedTime;

    public SmsOptRecord from(String from) {
        this.from = from;
        return this;
    }

    public SmsOptRecord to(String to) {
        this.to = to;
        return this;
    }

    public SmsOptRecord optStatus(String optStatus) {
        this.optStatus = optStatus;
        return this;
    }

    public SmsOptRecord source(String source) {
        this.source = source;
        return this;
    }

    public SmsOptRecord lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
}
