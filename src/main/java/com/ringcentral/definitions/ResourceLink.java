package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ResourceLink
{
    //
    public String uri;
    public ResourceLink uri(String uri) {
        this.uri = uri;
        return this;
    }
}
