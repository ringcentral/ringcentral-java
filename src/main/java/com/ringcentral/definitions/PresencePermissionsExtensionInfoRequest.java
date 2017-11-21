package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PresencePermissionsExtensionInfoRequest
{
    // Internal identifier of an extension
    public String id;
    public PresencePermissionsExtensionInfoRequest id(String id) {
        this.id = id;
        return this;
    }
}
