package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SubResource
{
    //
    public String uri;
    public SubResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String resourceDescription;
    public SubResource resourceDescription(String resourceDescription) {
        this.resourceDescription = resourceDescription;
        return this;
    }
    //
    public Long parentId;
    public SubResource parentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    //
    public Long subId;
    public SubResource subId(Long subId) {
        this.subId = subId;
        return this;
    }
    //
    public ApiVersionResource subVer;
    public SubResource subVer(ApiVersionResource subVer) {
        this.subVer = subVer;
        return this;
    }
}
