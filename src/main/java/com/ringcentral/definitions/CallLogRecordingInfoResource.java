package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CallLogRecordingInfoResource
{
    //
    public String uri;
    public CallLogRecordingInfoResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public CallLogRecordingInfoResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String contentUri;
    public CallLogRecordingInfoResource contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }
    //
    public String contentType;
    public CallLogRecordingInfoResource contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    //
    public Long duration;
    public CallLogRecordingInfoResource duration(Long duration) {
        this.duration = duration;
        return this;
    }
}
