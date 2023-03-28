package com.ringcentral.definitions;


public class PubNubDeliveryMode {
    /**
     * Notifications transport type
     * Required
     * Enum: PubNub
     */
    public String transportType;
    /**
     * Optional. Specifies if notification messages will be encrypted
     * or not. Please note that for some event filters (e.g. presence) encryption is mandatory and
     * `false` value provided by caller will be ignored.
     * Required
     */
    public Boolean encryption;
    /**
     * PubNub channel name
     * Required
     * Example: 54770517599294_6dda849e
     */
    public String address;
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

    public PubNubDeliveryMode transportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    public PubNubDeliveryMode encryption(Boolean encryption) {
        this.encryption = encryption;
        return this;
    }

    public PubNubDeliveryMode address(String address) {
        this.address = address;
        return this;
    }

    public PubNubDeliveryMode subscriberKey(String subscriberKey) {
        this.subscriberKey = subscriberKey;
        return this;
    }

    public PubNubDeliveryMode secretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    public PubNubDeliveryMode encryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }

    public PubNubDeliveryMode encryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
}
