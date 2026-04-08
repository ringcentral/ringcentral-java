package com.ringcentral.definitions;

public class SmsOptFailureRecord {
    /** Phone number in e.164 format (with &#039;+&#039; prefix) Required Example: +16501234567 */
    public String to;

    public SmsOptFailureRecord to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Consent status of a recipient&#039;s phone number: - `OptOut` - The number is opted out of
     * receiving SMS. - `OptIn` - The number is opted in to receiving SMS (if it was previously
     * opted out). Required Example: OptOut Enum: OptOut, OptIn
     */
    public String optStatus;

    public SmsOptFailureRecord optStatus(String optStatus) {
        this.optStatus = optStatus;
        return this;
    }

    /** Phone number in e.164 format (with &#039;+&#039; prefix) Required Example: +16501234567 */
    public String from;

    public SmsOptFailureRecord from(String from) {
        this.from = from;
        return this;
    }

    /** The source of the consent record Required Enum: Recipient, Api, Upstream, Carrier */
    public String source;

    public SmsOptFailureRecord source(String source) {
        this.source = source;
        return this;
    }

    /** Required */
    public ApiError error;

    public SmsOptFailureRecord error(ApiError error) {
        this.error = error;
        return this;
    }
}
