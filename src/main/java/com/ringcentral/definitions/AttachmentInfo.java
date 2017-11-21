package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AttachmentInfo
{
    //
    public String uri;
    public AttachmentInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String contentType;
    public AttachmentInfo contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
}
