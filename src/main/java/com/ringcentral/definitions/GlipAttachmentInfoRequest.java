package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipAttachmentInfoRequest
{
    // Internal identifier of an attachment
    public String id;
    public GlipAttachmentInfoRequest id(String id) {
        this.id = id;
        return this;
    }
    // Type of an attachment
    public String attachmentType;
    public GlipAttachmentInfoRequest attachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
        return this;
    }
}
