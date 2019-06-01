package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class NotificationInfo {
    /**
     * Alert information
     */
    public AlertInfo alert;
    /**
     * Number of incoming messages
     */
    public String badge;
    /**
     * Message sound
     */
    public String sound;
    /**
     * Content availability
     */
    @JSONField(name = "content-available")
    public String contentAvailable;
    /**
     * Category of a message
     */
    public String category;

    public NotificationInfo alert(AlertInfo alert) {
        this.alert = alert;
        return this;
    }

    public NotificationInfo badge(String badge) {
        this.badge = badge;
        return this;
    }

    public NotificationInfo sound(String sound) {
        this.sound = sound;
        return this;
    }

    public NotificationInfo contentAvailable(String contentAvailable) {
        this.contentAvailable = contentAvailable;
        return this;
    }

    public NotificationInfo category(String category) {
        this.category = category;
        return this;
    }

}
