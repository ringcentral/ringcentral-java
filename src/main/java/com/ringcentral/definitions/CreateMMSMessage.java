package com.ringcentral.definitions;


public class CreateMMSMessage
{
    /**
     * Required
     */
    public MessageStoreCallerInfoRequest from;
    public CreateMMSMessage from(MessageStoreCallerInfoRequest from)
    {
        this.from = from;
        return this;
    }

    /**
     * Message receiver(s) information. The `phoneNumber` value is required
     * Required
     */
    public MessageStoreCallerInfoRequest[] to;
    public CreateMMSMessage to(MessageStoreCallerInfoRequest[] to)
    {
        this.to = to;
        return this;
    }

    /**
     * Text of a message. Max length is 1000 symbols (2-byte UTF-16 encoded). If a character is encoded in 4 bytes in UTF-16 it is treated as 2 characters, thus restricting the maximum message length to 500 symbols
     */
    public String text;
    public CreateMMSMessage text(String text)
    {
        this.text = text;
        return this;
    }

    /**
     */
    public MessageCountryInfo country;
    public CreateMMSMessage country(MessageCountryInfo country)
    {
        this.country = country;
        return this;
    }

    /**
     * Files to send
     * Required
     */
    public Attachment[] attachments;
    public CreateMMSMessage attachments(Attachment[] attachments)
    {
        this.attachments = attachments;
        return this;
    }
}