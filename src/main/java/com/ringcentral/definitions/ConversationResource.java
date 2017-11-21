package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ConversationResource
{
    //
    public String id;
    public ConversationResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public DeliveryModeResource typingNotifications;
    public ConversationResource typingNotifications(DeliveryModeResource typingNotifications) {
        this.typingNotifications = typingNotifications;
        return this;
    }
    //
    public String uri;
    public ConversationResource uri(String uri) {
        this.uri = uri;
        return this;
    }
}
