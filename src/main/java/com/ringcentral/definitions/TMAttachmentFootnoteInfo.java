package com.ringcentral.definitions;


public class TMAttachmentFootnoteInfo {
    /**
     * Text of a footer
     */
    public String text;
    /**
     * Link to an icon displayed to the left of a footer; sized 32x32px
     * Format: uri
     */
    public String iconUri;
    /**
     * Message creation datetime in ISO 8601 format including timezone
     * Format: date-time
     * Example: 2016-03-10T18:07:52.534Z
     */
    public String time;

    public TMAttachmentFootnoteInfo text(String text) {
        this.text = text;
        return this;
    }

    public TMAttachmentFootnoteInfo iconUri(String iconUri) {
        this.iconUri = iconUri;
        return this;
    }

    public TMAttachmentFootnoteInfo time(String time) {
        this.time = time;
        return this;
    }
}
