package com.ringcentral.definitions;


/**
 * Notification delivery transport information
 */
public class NotificationDeliveryModeRequest {
    /**
     * The transport type for this subscription, or the channel by which an app should be notified of an event
     * Required
     * Enum: WebHook, RC/APNS, RC/GCM, PubNub
     */
    public String transportType;
    /**
     * The URL to which notifications should be delivered. This is only applicable for the `WebHook` transport type, for which it is a required field.
     * Required
     * Format: uri
     * Example: https://acme.com/myservice/webhook
     */
    public String address;
    /**
     * An optional validation token used to verify the authenticity of the incoming webhook. Applicable only for the `WebHook` transport type.
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
