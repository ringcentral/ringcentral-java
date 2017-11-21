package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PresenceLineResource
{
    //
    public String id;
    public PresenceLineResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public InlinedExtensionResource extension;
    public PresenceLineResource extension(InlinedExtensionResource extension) {
        this.extension = extension;
        return this;
    }
}
