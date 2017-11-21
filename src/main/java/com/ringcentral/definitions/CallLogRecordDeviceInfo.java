package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CallLogRecordDeviceInfo
{
    // Internal identifier of a device
    public String id;
    public CallLogRecordDeviceInfo id(String id) {
        this.id = id;
        return this;
    }
    // string to a device
    public String uri;
    public CallLogRecordDeviceInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
}
