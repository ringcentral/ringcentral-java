package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CallLogRecordResource
{
    //
    public String uri;
    public CallLogRecordResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public CallLogRecordResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String sessionId;
    public CallLogRecordResource sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    //
    public String startTime;
    public CallLogRecordResource startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    //
    public Long duration;
    public CallLogRecordResource duration(Long duration) {
        this.duration = duration;
        return this;
    }
    //
    public String type;
    public CallLogRecordResource type(String type) {
        this.type = type;
        return this;
    }
    //
    public String direction;
    public CallLogRecordResource direction(String direction) {
        this.direction = direction;
        return this;
    }
    //
    public String action;
    public CallLogRecordResource action(String action) {
        this.action = action;
        return this;
    }
    //
    public String result;
    public CallLogRecordResource result(String result) {
        this.result = result;
        return this;
    }
    //
    public CallerInfo to;
    public CallLogRecordResource to(CallerInfo to) {
        this.to = to;
        return this;
    }
    //
    public CallerInfo from;
    public CallLogRecordResource from(CallerInfo from) {
        this.from = from;
        return this;
    }
    //
    public CallLogRecordingResource recording;
    public CallLogRecordResource recording(CallLogRecordingResource recording) {
        this.recording = recording;
        return this;
    }
}
