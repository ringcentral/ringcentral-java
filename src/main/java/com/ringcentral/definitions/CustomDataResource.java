package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CustomDataResource
{
    //
    public String uri;
    public CustomDataResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public CustomDataResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String value;
    public CustomDataResource value(String value) {
        this.value = value;
        return this;
    }
    //
    public String lastModifiedTime;
    public CustomDataResource lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    //
    public AttachmentInfo attachment;
    public CustomDataResource attachment(AttachmentInfo attachment) {
        this.attachment = attachment;
        return this;
    }
}
