package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CustomDataAttachmentInfo
{
    // Link to custom data attachment
    public String uri;
    public CustomDataAttachmentInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Type of custom data attachment, see also MIME Types
    public String contentType;
    public CustomDataAttachmentInfo contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
}
