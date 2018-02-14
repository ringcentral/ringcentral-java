package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionFavoritesEvent
{
    // Internal identifier of an extension
    public String extensionId;
    public ExtensionFavoritesEvent extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
}
