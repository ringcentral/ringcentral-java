package com.ringcentral.definitions;


/**
 * Notification delivery transport information
 */
public class AnyInternalDeliveryModeRequest {
    /**
     * The transport type for this subscription
     * Required
     * Enum: WebHook, RC/APNS, RC/GCM, PubNub, Internal
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
    /**
     * (Only for an `Internal` transport)
     * The name of internal channel (defined in the backend service configuration) to deliver notifications through.
     * Required
     * Example: my-server-channel
     */
    public String configName;

    public AnyInternalDeliveryModeRequest transportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    public AnyInternalDeliveryModeRequest address(String address) {
        this.address = address;
        return this;
    }

    public AnyInternalDeliveryModeRequest verificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
        return this;
    }

    public AnyInternalDeliveryModeRequest certificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }

    public AnyInternalDeliveryModeRequest registrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }

    public AnyInternalDeliveryModeRequest encryption(Boolean encryption) {
        this.encryption = encryption;
        return this;
    }

    public AnyInternalDeliveryModeRequest configName(String configName) {
        this.configName = configName;
        return this;
    }
}
