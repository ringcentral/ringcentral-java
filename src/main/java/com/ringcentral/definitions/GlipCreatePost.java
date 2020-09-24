package com.ringcentral.definitions;


public class GlipCreatePost {
    /**
     *
     */
    public String activity;
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
    /**
     *
     */
    public String[] personIds;
    /**
     *
     */
    public Boolean system;

    public GlipCreatePost activity(String activity) {
        this.activity = activity;
        return this;
    }

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

    public GlipCreatePost personIds(String[] personIds) {
        this.personIds = personIds;
        return this;
    }

    public GlipCreatePost system(Boolean system) {
        this.system = system;
        return this;
    }

}
