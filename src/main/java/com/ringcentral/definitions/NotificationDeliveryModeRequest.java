package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class NotificationDeliveryModeRequest
{
    // Notifications transportation provider name. 'APNS' (Apple Push Notifications Service)
    public String transportType;
    public NotificationDeliveryModeRequest transportType(String transportType) {
        this.transportType = transportType;
        return this;
    }
    // Optional parameter. Specifies if the message will be encrypted or not. If request contains any presence event filter the value by default is 'True' (even if specified as 'false'). If request contains only message event filters the value by default is 'False'
    public Boolean encryption;
    public NotificationDeliveryModeRequest encryption(Boolean encryption) {
        this.encryption = encryption;
        return this;
    }
}
