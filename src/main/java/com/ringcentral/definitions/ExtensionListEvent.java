package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionListEvent
{
    // Internal identifier of an extension
    public String extensionId;
    public ExtensionListEvent extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
    // Type of extension info change
    public String eventType;
    public ExtensionListEvent eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
}
