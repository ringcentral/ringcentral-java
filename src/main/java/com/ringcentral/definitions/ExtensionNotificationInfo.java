package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionNotificationInfo
{
    // Internal identifier of the extension
    public String id;
    public ExtensionNotificationInfo id(String id) {
        this.id = id;
        return this;
    }
}
