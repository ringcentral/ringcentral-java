package com.ringcentral.definitions;


public class MobileDeliveryMode {
    /**
     * The transport type for this subscription, or the channel by which an app should be notified of an event
     * Required
     * Enum: RC/APNS, RC/GCM
     */
    public String transportType;
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
     * Specifies if notification messages will be encrypted or not.
     * Required
     * Enum: false
     */
    public Boolean encryption;

    public MobileDeliveryMode transportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    public MobileDeliveryMode certificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }

    public MobileDeliveryMode registrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }

    public MobileDeliveryMode encryption(Boolean encryption) {
        this.encryption = encryption;
        return this;
    }
}
