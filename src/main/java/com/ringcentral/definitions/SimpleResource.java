package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SimpleResource
{
    //
    public String uri;
    public SimpleResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String resourceDescription;
    public SimpleResource resourceDescription(String resourceDescription) {
        this.resourceDescription = resourceDescription;
        return this;
    }
    //
    public String id;
    public SimpleResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public ApiVersionResource ver;
    public SimpleResource ver(ApiVersionResource ver) {
        this.ver = ver;
        return this;
    }
}
