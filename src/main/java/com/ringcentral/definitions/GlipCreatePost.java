package com.ringcentral.definitions;


public class GlipCreatePost {
    /**
     * Title of a message. (Can be set for bot's messages only).
     */
    public String title;
    /**
     * Text of a post
     * Maximum: 1000
     */
    public String text;
    /**
     * Internal identifier of a group
     */
    public String groupId;
    /**
     * List of attachments to be posted
     */
    public GlipMessageAttachmentInfoRequest[] attachments;

    public GlipCreatePost title(String title) {
        this.title = title;
        return this;
    }

    public GlipCreatePost text(String text) {
        this.text = text;
        return this;
    }

    public GlipCreatePost groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public GlipCreatePost attachments(GlipMessageAttachmentInfoRequest[] attachments) {
        this.attachments = attachments;
        return this;
    }

}
