package com.ringcentral.definitions;


public class NotificationDeliveryModeRequest {
    /**
     * Notifications transport type
     * Required
     * Enum: WebHook, RC/APNS, RC/GCM, PubNub
     */
    public String transportType;
    /**
     * (Only for a &quot;WebHook&quot; transport, required) URL of a subscriber&#039;s web service
     * Required
     * Format: uri
     * Example: https://acme.com/myservice/webhook
     */
    public String address;
    /**
     * (Only for a &quot;WebHook&quot; transport, optional) Subscription verification token
     */
    public String verificationToken;
    /**
     * Certificate name for mobile notification transports
     * Required
     */
    public String certificateName;
    /**
     * Device instance ID for mobile notification transports
     * Required
     * Example: 38b062ae-85f8-4dcc-8734-04d3f7393d42
     */
    public String registrationId;
    /**
     * Optional. Specifies if notification messages will be encrypted
     * or not. Please note that for some event filters (e.g. presence) encryption is mandatory and
     * `false` value provided by caller will be ignored.
     */
    public Boolean encryption;

    public NotificationDeliveryModeRequest transportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    public NotificationDeliveryModeRequest address(String address) {
        this.address = address;
        return this;
    }

    public NotificationDeliveryModeRequest verificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
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

    public NotificationDeliveryModeRequest encryption(Boolean encryption) {
        this.encryption = encryption;
        return this;
    }
}
