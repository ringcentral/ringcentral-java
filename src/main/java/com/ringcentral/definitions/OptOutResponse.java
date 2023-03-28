package com.ringcentral.definitions;


/**
 * Opt-out record
 */
public class OptOutResponse {
    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format from which the recipient has opted out
     * Example: 15551234567
     */
    public String from;
    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format which is opted out
     * Example: 15551234567
     */
    public String to;
    /**
     * Status of a phone number
     * Enum: OptIn, OptOut
     */
    public String status;
    /**
     * Enum: Recipient, Account, Upstream, Carrier
     */
    public String source;

    public OptOutResponse from(String from) {
        this.from = from;
        return this;
    }

    public OptOutResponse to(String to) {
        this.to = to;
        return this;
    }

    public OptOutResponse status(String status) {
        this.status = status;
        return this;
    }

    public OptOutResponse source(String source) {
        this.source = source;
        return this;
    }
}
