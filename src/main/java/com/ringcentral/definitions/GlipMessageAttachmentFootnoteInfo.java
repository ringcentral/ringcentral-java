package com.ringcentral.definitions;


public class GlipMessageAttachmentFootnoteInfo {
    /**
     * Text of a footer
     */
    public String text;
    /**
     * Link to an icon displayed to the left of a footer; sized 32x32px
     */
    public String iconUri;
    /**
     * Message creation datetime in ISO 8601 format including timezone, for example *2016-03-10T18:07:52.534Z*
     */
    public String time;

    public GlipMessageAttachmentFootnoteInfo text(String text) {
        this.text = text;
        return this;
    }

    public GlipMessageAttachmentFootnoteInfo iconUri(String iconUri) {
        this.iconUri = iconUri;
        return this;
    }

    public GlipMessageAttachmentFootnoteInfo time(String time) {
        this.time = time;
        return this;
    }

}
