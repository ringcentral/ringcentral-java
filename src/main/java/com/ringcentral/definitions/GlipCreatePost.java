package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipCreatePost
{
    // Internal identifier of a group to send post to
    public String groupId;
    public GlipCreatePost groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    // Text of a post, the maximum is 10000 characters
    public String text;
    public GlipCreatePost text(String text) {
        this.text = text;
        return this;
    }
    // List of attachments to be posted
    public GlipAttachmentInfoRequest[] attachments;
    public GlipCreatePost attachments(GlipAttachmentInfoRequest[] attachments) {
        this.attachments = attachments;
        return this;
    }
}
