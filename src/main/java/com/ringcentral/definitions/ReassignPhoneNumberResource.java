package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ReassignPhoneNumberResource
{
    //
    public String uri;
    public ReassignPhoneNumberResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public ReassignPhoneNumberResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String usageType;
    public ReassignPhoneNumberResource usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
    //
    public ExtensionReferenceResource extension;
    public ReassignPhoneNumberResource extension(ExtensionReferenceResource extension) {
        this.extension = extension;
        return this;
    }
}
