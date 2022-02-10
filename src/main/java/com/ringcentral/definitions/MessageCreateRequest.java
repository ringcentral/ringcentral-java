package com.ringcentral.definitions;


/**
 * Single individual SMS resource
 */
public class MessageCreateRequest {
    /**
     * List of phone numbers in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format, recipients of this message. Currently only one number is supported
     * Required
     * Example: 15551234567
     */
    public String[] to;
    /**
     * Text to send, maximum number of characters is 1000
     * Example: Hello, World!
     */
    public String text;

    public MessageCreateRequest to(String[] to) {
        this.to = to;
        return this;
    }

    public MessageCreateRequest text(String text) {
        this.text = text;
        return this;
    }
}
