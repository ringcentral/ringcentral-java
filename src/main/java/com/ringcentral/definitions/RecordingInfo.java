package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class RecordingInfo
{
    // Internal identifier of the call recording
    public String id;
    public RecordingInfo id(String id) {
        this.id = id;
        return this;
    }
    // Link to the call recording metadata resource
    public String uri;
    public RecordingInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Indicates recording mode used
    public String type;
    public RecordingInfo type(String type) {
        this.type = type;
        return this;
    }
    // Link to the call recording binary content
    public String contentUri;
    public RecordingInfo contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }
}
