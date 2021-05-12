package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


// Apple Push Notification Service Info
public class GlipAPSInfo {
    /**
     * If the value is &#039;1&#039; then notification is turned on even if the application is in background
     */
    @SerializedName("content-available")
    public Long contentAvailable;

    public GlipAPSInfo contentAvailable(Long contentAvailable) {
        this.contentAvailable = contentAvailable;
        return this;
    }
}
