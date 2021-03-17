package com.ringcentral.definitions;


    // Delivery mode data
public class NotificationDeliveryMode
{
    /**
         * Optional parameter. Specifies if the message will be encrypted or not
         */
        public Boolean encryption;
  public NotificationDeliveryMode encryption(Boolean encryption)
  {
    this.encryption = encryption;
    return this;
  }
  

        /**
         * PubNub channel name
         */
        public String address;
  public NotificationDeliveryMode address(String address)
  {
    this.address = address;
    return this;
  }
  

        /**
         * PubNub subscriber credentials required to subscribe to the channel
         */
        public String subscriberKey;
  public NotificationDeliveryMode subscriberKey(String subscriberKey)
  {
    this.subscriberKey = subscriberKey;
    return this;
  }
  

        /**
         * PubNub subscriber credentials required to subscribe to the channel. Optional (for PubNub transport type only)
         */
        public String secretKey;
  public NotificationDeliveryMode secretKey(String secretKey)
  {
    this.secretKey = secretKey;
    return this;
  }
  

        /**
         * Encryption algorithm 'AES' (for PubNub transport type only)
         */
        public String encryptionAlgorithm;
  public NotificationDeliveryMode encryptionAlgorithm(String encryptionAlgorithm)
  {
    this.encryptionAlgorithm = encryptionAlgorithm;
    return this;
  }
  

        /**
         * Key for notification message decryption (for PubNub transport type only)
         */
        public String encryptionKey;
  public NotificationDeliveryMode encryptionKey(String encryptionKey)
  {
    this.encryptionKey = encryptionKey;
    return this;
  }
  

        /**
         * Notifications transportation provider name
         * Enum: PubNub, WebHook, RC/APNS, RC/GCM
         */
        public String transportType;
  public NotificationDeliveryMode transportType(String transportType)
  {
    this.transportType = transportType;
    return this;
  }
  

        /**
         * Name of a certificate. Supported for 'RC/APNS' and 'RC/GCM' transport types
         */
        public String certificateName;
  public NotificationDeliveryMode certificateName(String certificateName)
  {
    this.certificateName = certificateName;
    return this;
  }
  

        /**
         * Identifier of a registration. Supported for 'RC/APNS' and 'RC/GCM' transport types
         */
        public String registrationId;
  public NotificationDeliveryMode registrationId(String registrationId)
  {
    this.registrationId = registrationId;
    return this;
  }
  
}
