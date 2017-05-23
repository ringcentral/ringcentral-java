package com.ringcentral.definitions;

public class DeliveryMode {
    // Notifications transportation provider name. 'APNS' (Apple Push Notifications Service)
    public String transportType;
    // Optional parameter. Specifies if the message will be encrypted or not. For APNS transport type the value is always "false"
    public Boolean encryption;
    // PubNub channel name. For APNS transport type - internal identifier of a device "device_token"
    public String address;
    // PubNub subscriber credentials required to subscribe to the channel
    public String subscriberKey;
    // PubNub subscriber credentials required to subscribe to the channel. Optional (for PubNub transport type only)
    public String secretKey;
    // Encryption algorithm 'AES' (for PubNub transport type only)
    public String encryptionAlgorithm;
    // Key for notification message decryption (for PubNub transport type only)
    public String encryptionKey;
}
