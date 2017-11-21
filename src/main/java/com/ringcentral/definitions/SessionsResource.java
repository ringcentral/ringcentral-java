package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SessionsResource
{
    //
    public String uri;
    public SessionsResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public VersionedResource[] records;
    public SessionsResource records(VersionedResource[] records) {
        this.records = records;
        return this;
    }
}
