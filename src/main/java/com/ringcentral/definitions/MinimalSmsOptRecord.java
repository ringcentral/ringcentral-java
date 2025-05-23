package com.ringcentral.definitions;


public class MinimalSmsOptRecord {
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

    public MinimalSmsOptRecord from(String from) {
        this.from = from;
        return this;
    }

    public MinimalSmsOptRecord to(String to) {
        this.to = to;
        return this;
    }
}
