package com.ringcentral.definitions;

/** Post data. At least one attribute should be provided (text or attachments) */
public class TMCreatePostRequest {
    /**
     * Text of a post. Maximum length is 10000 symbols. Mentions can be added in .md format
     * `![:Type](id)`
     */
    public String text;

    public TMCreatePostRequest text(String text) {
        this.text = text;
        return this;
    }

    /** Internal identifier of a parent post, in case post is a part of a thread */
    public String parentPostId;

    public TMCreatePostRequest parentPostId(String parentPostId) {
        this.parentPostId = parentPostId;
        return this;
    }

    /** Internal identifier of a thread, in case post is a part of a thread */
    public String threadId;

    public TMCreatePostRequest threadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /** Identifier(s) of attachments. Maximum number of attachments is 25 */
    public TMAttachmentInfo[] attachments;

    public TMCreatePostRequest attachments(TMAttachmentInfo[] attachments) {
        this.attachments = attachments;
        return this;
    }
}
