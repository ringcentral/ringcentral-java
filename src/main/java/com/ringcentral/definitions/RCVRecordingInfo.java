package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class RCVRecordingInfo
{
    // Meeting record size in bytes
    public Long size;
    public RCVRecordingInfo size(Long size) {
        this.size = size;
        return this;
    }
    // Meeting duration in seconds
    public Long duration;
    public RCVRecordingInfo duration(Long duration) {
        this.duration = duration;
        return this;
    }
    // Link to a meeting record
    public String url;
    public RCVRecordingInfo url(String url) {
        this.url = url;
        return this;
    }
}
