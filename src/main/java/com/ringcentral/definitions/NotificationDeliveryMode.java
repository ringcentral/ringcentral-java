package com.ringcentral.definitions;


public class NotificationDeliveryMode
{
    /**
     * Notifications transport name, e.g. &quot;WebHook&quot;
     * Required
     * Enum: PubNub, RC/APNS, RC/GCM, WebHook, WebSocket
     */
    public String transportType;
    public NotificationDeliveryMode transportType(String transportType)
    {
        this.transportType = transportType;
        return this;
    }

    /**
     * For a &quot;WebHook&quot; transport - URL of a consumer service (cannot be changed during subscription update)
     * Example: https://acme.com/myservice/webhook
     */
    public String address;
    public NotificationDeliveryMode address(String address)
    {
        this.address = address;
        return this;
    }

    /**
     * Optional parameter. Specifies if the message will be encrypted
    * or not. If request contains any presence event filter the value by default
    * is &#039;true&#039; (even if specified as &#039;false&#039;). If request contains only message
    * event filters the value by default is &#039;false&#039;
     */
    public Boolean encryption;
    public NotificationDeliveryMode encryption(Boolean encryption)
    {
        this.encryption = encryption;
        return this;
    }

    /**
     * Certificate name (for &quot;RC/APNS&quot; and &quot;RC/GCM&quot; transport types only)
     */
    public String certificateName;
    public NotificationDeliveryMode certificateName(String certificateName)
    {
        this.certificateName = certificateName;
        return this;
    }

    /**
     * Registration identifier (for &quot;RC/APNS&quot; and &quot;RC/GCM&quot; transport types only)
     */
    public String registrationId;
    public NotificationDeliveryMode registrationId(String registrationId)
    {
        this.registrationId = registrationId;
        return this;
    }

    /**
     * Subscription verification token ensuring data security (For &quot;Webhook&quot; transport type only)
     */
    public String verificationToken;
    public NotificationDeliveryMode verificationToken(String verificationToken)
    {
        this.verificationToken = verificationToken;
        return this;
    }

    /**
     * PubNub subscriber credentials required to subscribe to the channel (for &quot;PubNub&quot; transport type only)
     */
    public String subscriberKey;
    public NotificationDeliveryMode subscriberKey(String subscriberKey)
    {
        this.subscriberKey = subscriberKey;
        return this;
    }

    /**
     * PubNub subscriber credentials required to subscribe to the channel (for &quot;PubNub&quot; transport type only)
     */
    public String secretKey;
    public NotificationDeliveryMode secretKey(String secretKey)
    {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * Encryption algorithm &quot;AES&quot; (for &quot;PubNub&quot; transport type only)
     */
    public String encryptionAlgorithm;
    public NotificationDeliveryMode encryptionAlgorithm(String encryptionAlgorithm)
    {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }

    /**
     * Key for notification message decryption (for &quot;PubNub&quot; transport type only)
     */
    public String encryptionKey;
    public NotificationDeliveryMode encryptionKey(String encryptionKey)
    {
        this.encryptionKey = encryptionKey;
        return this;
    }
}