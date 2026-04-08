package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


    /**
* APS (Apple Push Service) information/ priority data
*/
public class APSInfo
{
    /**
     * If the value is &#039;1&#039; then notification is turned on even if the application is in background
     * Format: int32
     */
    @SerializedName("content-available")
    public Long contentAvailable;
    public APSInfo contentAvailable(Long contentAvailable)
    {
        this.contentAvailable = contentAvailable;
        return this;
    }
}