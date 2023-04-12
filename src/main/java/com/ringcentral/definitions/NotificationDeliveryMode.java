package com.ringcentral.definitions;


/**
 * Notification delivery transport information
 */
public class NotificationDeliveryMode {
    /**
     * Notifications transport type
     * Required
     * Enum: WebHook, RC/APNS, RC/GCM, PubNub
     */
    public String transportType;
    /**
     * PubNub channel name
     * Required
     * Format: uri
     * Example: 54770517599294_6dda849e
     */
    public String address;
    /**
     * Optional. Specifies if notification messages will be encrypted
     * or not. Please note that for some event filters (e.g. presence) encryption is mandatory and
     * `false` value provided by caller will be ignored.
     * Required
     * Enum: false
     */
    public Boolean encryption;
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
     * PubNub credential required to subscribe to the channel
     * Required
     */
    public String subscriberKey;
    /**
     * PubNub credential required to subscribe to the channel
     * Required
     */
    public String secretKey;
    /**
     * (Only for a &quot;PubNub&quot; transport, returned only if `encryption` is `true`)
     * Encryption algorithm used
     * Enum: AES
     */
    public String encryptionAlgorithm;
    /**
     * (Only for a &quot;PubNub&quot; transport, returned only if `encryption` is `true`)
     * Cryptographic key to decrypt PubNub notification messages
     */
    public String encryptionKey;

    public NotificationDeliveryMode transportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    public NotificationDeliveryMode address(String address) {
        this.address = address;
        return this;
    }

    public NotificationDeliveryMode encryption(Boolean encryption) {
        this.encryption = encryption;
        return this;
    }

    public NotificationDeliveryMode certificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }

    public NotificationDeliveryMode registrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }

    public NotificationDeliveryMode subscriberKey(String subscriberKey) {
        this.subscriberKey = subscriberKey;
        return this;
    }

    public NotificationDeliveryMode secretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    public NotificationDeliveryMode encryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }

    public NotificationDeliveryMode encryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
}
