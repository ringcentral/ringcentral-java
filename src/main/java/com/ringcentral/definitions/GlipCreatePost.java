package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipCreatePost
{
    // Text of a post, the maximum is 10000 unicode characters
    public String text;
    public GlipCreatePost text(String text) {
        this.text = text;
        return this;
    }
    // List of attachments to be posted
    public GlipMessageAttachmentInfoRequest[] attachments;
    public GlipCreatePost attachments(GlipMessageAttachmentInfoRequest[] attachments) {
        this.attachments = attachments;
        return this;
    }
}
