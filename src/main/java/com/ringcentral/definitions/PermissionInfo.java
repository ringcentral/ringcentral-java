package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PermissionInfo
{
    // Specifies if a permission is enabled or not
    public Boolean enabled;
    public PermissionInfo enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
