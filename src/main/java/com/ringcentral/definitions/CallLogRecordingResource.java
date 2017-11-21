package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CallLogRecordingResource
{
    //
    public String uri;
    public CallLogRecordingResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public CallLogRecordingResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String type;
    public CallLogRecordingResource type(String type) {
        this.type = type;
        return this;
    }
    //
    public String contentUri;
    public CallLogRecordingResource contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }
}
