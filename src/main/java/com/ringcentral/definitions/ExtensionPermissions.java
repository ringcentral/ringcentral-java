package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionPermissions
{
    // Admin permission
    public PermissionInfo admin;
    public ExtensionPermissions admin(PermissionInfo admin) {
        this.admin = admin;
        return this;
    }
    // International Calling permission
    public PermissionInfo internationalCalling;
    public ExtensionPermissions internationalCalling(PermissionInfo internationalCalling) {
        this.internationalCalling = internationalCalling;
        return this;
    }
}
