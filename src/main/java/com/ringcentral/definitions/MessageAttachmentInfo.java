package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class MessageAttachmentInfo
{
    // Internal identifier of a message attachment
    public String id;
    public MessageAttachmentInfo id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of a message attachment
    public String uri;
    public MessageAttachmentInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Type of message attachment
    public String type;
    public MessageAttachmentInfo type(String type) {
        this.type = type;
        return this;
    }
    // MIME type for a given attachment, for instance 'audio/wav'
    public String contentType;
    public MessageAttachmentInfo contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    // Voicemail only Duration of the voicemail in seconds
    public Long vmDuration;
    public MessageAttachmentInfo vmDuration(Long vmDuration) {
        this.vmDuration = vmDuration;
        return this;
    }
    // Name of a file attached
    public String filename;
    public MessageAttachmentInfo filename(String filename) {
        this.filename = filename;
        return this;
    }
    // Size of attachment in bytes
    public Long size;
    public MessageAttachmentInfo size(Long size) {
        this.size = size;
        return this;
    }
}
