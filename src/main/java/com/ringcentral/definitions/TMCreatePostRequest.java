package com.ringcentral.definitions;


/**
 * Post data. At least one attribute should be provided (text or attachments)
 */
public class TMCreatePostRequest {
    /**
     * Text of a post. Maximum length is 10000 symbols. Mentions can be added in .md format `![:Type](id)`
     */
    public String text;
    /**
     * Identifier(s) of attachments. Maximum number of attachments is 25
     */
    public TMAttachmentInfo[] attachments;

    public TMCreatePostRequest text(String text) {
        this.text = text;
        return this;
    }

    public TMCreatePostRequest attachments(TMAttachmentInfo[] attachments) {
        this.attachments = attachments;
        return this;
    }
}
