package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class VersionedResource
{
    //
    public String uri;
    public VersionedResource uri(String uri) {
        this.uri = uri;
        return this;
    }
}
