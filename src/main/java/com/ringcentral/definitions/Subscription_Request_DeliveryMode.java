package com.ringcentral.definitions;

public class Subscription_Request_DeliveryMode {
    // Notifications transportation provider name. 'APNS' (Apple Push Notifications Service)
    public String transportType;
    // Optional parameter. Specifies if the message will be encrypted or not. If request contains any presence event filter the value by default is 'True' (even if specified as 'false'). If request contains only message event filters the value by default is 'False'
    public Boolean encryption;

    public Subscription_Request_DeliveryMode transportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    public Subscription_Request_DeliveryMode encryption(Boolean encryption) {
        this.encryption = encryption;
        return this;
    }
}
