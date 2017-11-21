package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class BotExtensionCreation
{
    // Link to a bot extension resource
    public String uri;
    public BotExtensionCreation uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Internal identifier of a bot extension
    public String id;
    public BotExtensionCreation id(String id) {
        this.id = id;
        return this;
    }
    // Bot extension number
    public String extensionNumber;
    public BotExtensionCreation extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
    // Bot name (equals to extension first name)
    public String name;
    public BotExtensionCreation name(String name) {
        this.name = name;
        return this;
    }
    // Identifier key of a bot application
    public String applicationKey;
    public BotExtensionCreation applicationKey(String applicationKey) {
        this.applicationKey = applicationKey;
        return this;
    }
    // User extension identifier
    public String creatorId;
    public BotExtensionCreation creatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
}
