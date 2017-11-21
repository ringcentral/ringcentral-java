package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class NotificationDeliveryMode
{
    // Notifications transportation provider name. 'APNS' (Apple Push Notifications Service)
    public String transportType;
    public NotificationDeliveryMode transportType(String transportType) {
        this.transportType = transportType;
        return this;
    }
    // Optional parameter. Specifies if the message will be encrypted or not. For APNS transport type the value is always  false
    public Boolean encryption;
    public NotificationDeliveryMode encryption(Boolean encryption) {
        this.encryption = encryption;
        return this;
    }
    // PubNub channel name. For APNS transport type - internal identifier of a device  device_token
    public String address;
    public NotificationDeliveryMode address(String address) {
        this.address = address;
        return this;
    }
    // PubNub subscriber credentials required to subscribe to the channel
    public String subscriberKey;
    public NotificationDeliveryMode subscriberKey(String subscriberKey) {
        this.subscriberKey = subscriberKey;
        return this;
    }
    // PubNub subscriber credentials required to subscribe to the channel. Optional (for PubNub transport type only)
    public String secretKey;
    public NotificationDeliveryMode secretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    // Encryption algorithm 'AES' (for PubNub transport type only)
    public String encryptionAlgorithm;
    public NotificationDeliveryMode encryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }
    // Key for notification message decryption (for PubNub transport type only)
    public String encryptionKey;
    public NotificationDeliveryMode encryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
}
