package com.ringcentral.definitions;


public class MobileDeliveryMode
{
    /**
     * The transport type for this subscription
     * Required
     * Enum: RC/APNS, RC/GCM
     */
    public String transportType;
    public MobileDeliveryMode transportType(String transportType)
    {
        this.transportType = transportType;
        return this;
    }

    /**
     * Certificate name for mobile notification transports
     * Required
     */
    public String certificateName;
    public MobileDeliveryMode certificateName(String certificateName)
    {
        this.certificateName = certificateName;
        return this;
    }

    /**
     * Device instance ID for mobile notification transports
     * Required
     * Example: 38b062ae-85f8-4dcc-8734-04d3f7393d42
     */
    public String registrationId;
    public MobileDeliveryMode registrationId(String registrationId)
    {
        this.registrationId = registrationId;
        return this;
    }

    /**
     * Specifies if notification messages will be encrypted or not.
     * Required
     * Enum: false
     */
    public Boolean encryption;
    public MobileDeliveryMode encryption(Boolean encryption)
    {
        this.encryption = encryption;
        return this;
    }
}