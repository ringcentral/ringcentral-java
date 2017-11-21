package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class VersioningResource
{
    //
    public String uri;
    public VersioningResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String resourceDescription;
    public VersioningResource resourceDescription(String resourceDescription) {
        this.resourceDescription = resourceDescription;
        return this;
    }
    //
    public String id;
    public VersioningResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public ApiVersionResource ver;
    public VersioningResource ver(ApiVersionResource ver) {
        this.ver = ver;
        return this;
    }
}
