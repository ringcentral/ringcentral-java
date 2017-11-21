package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipAttachmentInfo
{
    // Internal identifier of an attachment
    public String id;
    public GlipAttachmentInfo id(String id) {
        this.id = id;
        return this;
    }
    // Type of an attachment
    public String type;
    public GlipAttachmentInfo type(String type) {
        this.type = type;
        return this;
    }
    // Link to binary content
    public String contentUri;
    public GlipAttachmentInfo contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }
    // Name of a file
    public String name;
    public GlipAttachmentInfo name(String name) {
        this.name = name;
        return this;
    }
}
