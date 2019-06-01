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
    public Object[] attachments;

    public GlipPostPostBody text(String text) {
        this.text = text;
        return this;
    }

    public GlipPostPostBody attachments(Object[] attachments) {
        this.attachments = attachments;
        return this;
    }

}
