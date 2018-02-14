package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class NotificationInfo
{
    // Alert information
    public AlertInfo alerts;
    public NotificationInfo alerts(AlertInfo alerts) {
        this.alerts = alerts;
        return this;
    }
    // Number of incoming messages
    public String badge;
    public NotificationInfo badge(String badge) {
        this.badge = badge;
        return this;
    }
    // Message sound
    public String sound;
    public NotificationInfo sound(String sound) {
        this.sound = sound;
        return this;
    }
    // Content availability
    public String contentAvailable;
    public NotificationInfo contentAvailable(String contentAvailable) {
        this.contentAvailable = contentAvailable;
        return this;
    }
    // Category of a message
    public String category;
    public NotificationInfo category(String category) {
        this.category = category;
        return this;
    }
}
