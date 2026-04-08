package com.ringcentral.definitions;


public class TMAttachmentFootnoteInfo
{
    /**
     * Text of a footer
     */
    public String text;
    public TMAttachmentFootnoteInfo text(String text)
    {
        this.text = text;
        return this;
    }

    /**
     * Link to an icon displayed to the left of a footer; sized 32x32px
     * Format: uri
     */
    public String iconUri;
    public TMAttachmentFootnoteInfo iconUri(String iconUri)
    {
        this.iconUri = iconUri;
        return this;
    }

    /**
     * Message creation datetime in ISO 8601 format including timezone
     * Format: date-time
     * Example: Thu Mar 10 2016 10:07:52 GMT-0800 (Pacific Standard Time)
     */
    public String time;
    public TMAttachmentFootnoteInfo time(String time)
    {
        this.time = time;
        return this;
    }
}