package com.ringcentral.definitions;

public class SmsOptHistoryRecord {
    /** Phone number in e.164 format (with &#039;+&#039; prefix) Required Example: +16501234567 */
    public String to;

    public SmsOptHistoryRecord to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Consent status of a recipient&#039;s phone number: - `OptOut` - The number is opted out of
     * receiving SMS. - `OptIn` - The number is opted in to receiving SMS (if it was previously
     * opted out). Required Example: OptOut Enum: OptOut, OptIn
     */
    public String optStatus;

    public SmsOptHistoryRecord optStatus(String optStatus) {
        this.optStatus = optStatus;
        return this;
    }

    /** Phone number in e.164 format (with &#039;+&#039; prefix) Required Example: +16501234567 */
    public String from;

    public SmsOptHistoryRecord from(String from) {
        this.from = from;
        return this;
    }

    /** The source of the consent record Required Enum: Recipient, Api, Upstream, Carrier */
    public String source;

    public SmsOptHistoryRecord source(String source) {
        this.source = source;
        return this;
    }

    /** The time when the record was last updated Required Format: date-time */
    public String createdAt;

    public SmsOptHistoryRecord createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
