package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CustomDataApiResponse
{
    // Custom data access key
    public String id;
    public CustomDataApiResponse id(String id) {
        this.id = id;
        return this;
    }
    // Link to the custom data
    public String uri;
    public CustomDataApiResponse uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Description of custom data
    public String value;
    public CustomDataApiResponse value(String value) {
        this.value = value;
        return this;
    }
    // Time of the last change in custom data
    public String lastModifiedTime;
    public CustomDataApiResponse lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    // Attachment data: link and type
    public CustomDataAttachmentInfo attachment;
    public CustomDataApiResponse attachment(CustomDataAttachmentInfo attachment) {
        this.attachment = attachment;
        return this;
    }
}
