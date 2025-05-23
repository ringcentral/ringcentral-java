package com.ringcentral.definitions;


public class UpdateSmsOptRecord {
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

    public UpdateSmsOptRecord from(String from) {
        this.from = from;
        return this;
    }

    public UpdateSmsOptRecord to(String to) {
        this.to = to;
        return this;
    }

    public UpdateSmsOptRecord optStatus(String optStatus) {
        this.optStatus = optStatus;
        return this;
    }

    public UpdateSmsOptRecord source(String source) {
        this.source = source;
        return this;
    }
}
