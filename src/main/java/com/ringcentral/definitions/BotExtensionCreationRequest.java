package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class BotExtensionCreationRequest
{
    // Bot name (equals to extension first name)
    public String name;
    public BotExtensionCreationRequest name(String name) {
        this.name = name;
        return this;
    }
    // Key of a bot application
    public String applicationKey;
    public BotExtensionCreationRequest applicationKey(String applicationKey) {
        this.applicationKey = applicationKey;
        return this;
    }
    // User extension identifier
    public String creatorId;
    public BotExtensionCreationRequest creatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
}
