package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class Permission
{
    //
    public Boolean enabled;
    public Permission enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
