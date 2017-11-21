package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class RecipientInfo
{
    // Link to a recipient extension resource
    public String uri;
    public RecipientInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Internal identifier of a recipient extension
    public String id;
    public RecipientInfo id(String id) {
        this.id = id;
        return this;
    }
}
