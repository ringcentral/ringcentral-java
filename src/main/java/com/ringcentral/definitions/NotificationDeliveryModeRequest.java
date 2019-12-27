package com.ringcentral.definitions;


public class NotificationDeliveryModeRequest {
    /**
     * Notifications transportation provider name
     * Enum: PubNub, WebHook, RC/APNS, RC/GCM
     */
    public String transportType;
    /**
     * Mandatory for 'WebHook' transport type, URL of a consumer service (cannot be changed during subscription update)
     */
    public String address;
    /**
     * Optional parameter. Specifies if the message will be encrypted or not. If request contains any presence event filter the value by default is 'True' (even if specified as 'false'). If request contains only message event filters the value by default is 'False'
     */
    public Boolean encryption;
    /**
     * Name of a certificate. Supported for 'RC/APNS' and 'RC/GCM' transport types
     */
    public String certificateName;
    /**
     * Identifier of a registration. Supported for 'RC/APNS' and 'RC/GCM' transport types
     */
    public String registrationId;
    /**
     * Verification key of a subscription ensuring data security. Supported for 'Webhook' transport type
     */
    public String verificationToken;

    public NotificationDeliveryModeRequest transportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    public NotificationDeliveryModeRequest address(String address) {
        this.address = address;
        return this;
    }

    public NotificationDeliveryModeRequest encryption(Boolean encryption) {
        this.encryption = encryption;
        return this;
    }

    public NotificationDeliveryModeRequest certificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }

    public NotificationDeliveryModeRequest registrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }

    public NotificationDeliveryModeRequest verificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
        return this;
    }

}
