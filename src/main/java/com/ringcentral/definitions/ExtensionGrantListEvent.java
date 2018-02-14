package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionGrantListEvent
{
    // Internal identifier of an extension
    public String extensionId;
    public ExtensionGrantListEvent extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
}
