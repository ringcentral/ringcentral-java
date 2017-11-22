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
    // Mandatory for 'APNS' and 'WebHook' transport types. For 'APNS' - internal identifier of a device 'device_token' for 'WebHook' - URL of a consumer service (cannot be changed during subscription update)
    public String address;
    public NotificationDeliveryModeRequest address(String address) {
        this.address = address;
        return this;
    }
    // Optional parameter. Specifies if the message will be encrypted or not. If request contains any presence event filter the value by default is 'True' (even if specified as 'false'). If request contains only message event filters the value by default is 'False'
    public Boolean encryption;
    public NotificationDeliveryModeRequest encryption(Boolean encryption) {
        this.encryption = encryption;
        return this;
    }
    // For 'PubNub/APNS' and 'PubNub/GCM' transport types. Name of a certificate
    public String certificateName;
    public NotificationDeliveryModeRequest certificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }
    // For 'PubNub/APNS' and 'PubNub/GCM' transport types. Identifier of a registration
    public String registrationId;
    public NotificationDeliveryModeRequest registrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }
}
