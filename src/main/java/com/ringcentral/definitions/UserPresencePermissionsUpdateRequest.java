package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UserPresencePermissionsUpdateRequest
{
    //
    public PresencePermissionsExtensionInfoRequest[] extensions;
    public UserPresencePermissionsUpdateRequest extensions(PresencePermissionsExtensionInfoRequest[] extensions) {
        this.extensions = extensions;
        return this;
    }
}
