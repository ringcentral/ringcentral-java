package com.ringcentral.definitions;


public class CreateSMSMessage {
    /**
     * Required
     */
    public MessageStoreCallerInfoRequest from;
    /**
     * Message receiver(s) information. The `phoneNumber` value is required
     * Required
     */
    public MessageStoreCallerInfoRequest[] to;
    /**
     * Text of a message. Max length is 1000 symbols (2-byte UTF-16
     * encoded). If a character is encoded in 4 bytes in UTF-16 it is treated
     * as 2 characters, thus restricting the maximum message length to 500 symbols
     * Required
     */
    public String text;
    /**
     *
     */
    public SmsRequestCountryInfo country;

    public CreateSMSMessage from(MessageStoreCallerInfoRequest from) {
        this.from = from;
        return this;
    }

    public CreateSMSMessage to(MessageStoreCallerInfoRequest[] to) {
        this.to = to;
        return this;
    }

    public CreateSMSMessage text(String text) {
        this.text = text;
        return this;
    }

    public CreateSMSMessage country(SmsRequestCountryInfo country) {
        this.country = country;
        return this;
    }
}
