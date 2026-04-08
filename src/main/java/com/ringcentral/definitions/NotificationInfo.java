package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


    /**
* Information on a notification
*/
public class NotificationInfo
{
    /**
     */
    public AlertInfo alert;
    public NotificationInfo alert(AlertInfo alert)
    {
        this.alert = alert;
        return this;
    }

    /**
     * Number of incoming messages
     */
    public String badge;
    public NotificationInfo badge(String badge)
    {
        this.badge = badge;
        return this;
    }

    /**
     * Message sound
     */
    public String sound;
    public NotificationInfo sound(String sound)
    {
        this.sound = sound;
        return this;
    }

    /**
     * Content availability
     */
    @SerializedName("content-available")
    public String contentAvailable;
    public NotificationInfo contentAvailable(String contentAvailable)
    {
        this.contentAvailable = contentAvailable;
        return this;
    }

    /**
     * Category of a message
     */
    public String category;
    public NotificationInfo category(String category)
    {
        this.category = category;
        return this;
    }
}