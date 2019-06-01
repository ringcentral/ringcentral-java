package com.ringcentral.definitions;


public class NotificationDeliveryMode {
    /**
     * Notifications transportation provider name. 'APNS' (Apple Push Notifications Service)
     * Enum: PubNub, APNS, PubNub/APNS/VoIP
     */
    public String transportType;
    /**
     * Optional parameter. Specifies if the message will be encrypted or not. For APNS transport type the value is always  false
     */
    public Boolean encryption;
    /**
     * PubNub channel name. For APNS transport type - internal identifier of a device  device_token
     */
    public String address;
    /**
     * PubNub subscriber credentials required to subscribe to the channel
     */
    public String subscriberKey;
    /**
     * PubNub subscriber credentials required to subscribe to the channel. Optional (for PubNub transport type only)
     */
    public String secretKey;
    /**
     * Encryption algorithm 'AES' (for PubNub transport type only)
     */
    public String encryptionAlgorithm;
    /**
     * Key for notification message decryption (for PubNub transport type only)
     */
    public String encryptionKey;

    public NotificationDeliveryMode transportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    public NotificationDeliveryMode encryption(Boolean encryption) {
        this.encryption = encryption;
        return this;
    }

    public NotificationDeliveryMode address(String address) {
        this.address = address;
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
