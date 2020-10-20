package com.ringcentral.definitions;


public class GlipPostPostBody {
    /**
     * Post text.
     * Required
     */
    public String text;
    /**
     * Identifier(s) of attachments.
     */
    public GlipAttachmentInfoRequest[] attachments;

    public GlipPostPostBody text(String text) {
        this.text = text;
        return this;
    }

    public GlipPostPostBody attachments(GlipAttachmentInfoRequest[] attachments) {
        this.attachments = attachments;
        return this;
    }

}
