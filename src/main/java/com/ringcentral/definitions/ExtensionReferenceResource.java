package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionReferenceResource
{
    //
    public String id;
    public ExtensionReferenceResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String partnerId;
    public ExtensionReferenceResource partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }
}
