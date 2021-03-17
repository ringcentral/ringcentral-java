package com.ringcentral.definitions;


    // Notification delivery settings
public class NotificationDeliveryModeRequest
{
    /**
         * Notifications transportation provider name
         * Enum: PubNub, WebHook, RC/APNS, RC/GCM, WebSocket
         */
        public String transportType;
  public NotificationDeliveryModeRequest transportType(String transportType)
  {
    this.transportType = transportType;
    return this;
  }
  

        /**
         * Mandatory for 'WebHook' transport type, URL of a consumer service (cannot be changed during subscription update)
         */
        public String address;
  public NotificationDeliveryModeRequest address(String address)
  {
    this.address = address;
    return this;
  }
  

        /**
         * Optional parameter. Specifies if the message will be encrypted or not. If request contains any presence event filter the value by default is 'True' (even if specified as 'false'). If request contains only message event filters the value by default is 'False'
         */
        public Boolean encryption;
  public NotificationDeliveryModeRequest encryption(Boolean encryption)
  {
    this.encryption = encryption;
    return this;
  }
  

        /**
         * Name of a certificate. Supported for 'RC/APNS' and 'RC/GCM' transport types
         */
        public String certificateName;
  public NotificationDeliveryModeRequest certificateName(String certificateName)
  {
    this.certificateName = certificateName;
    return this;
  }
  

        /**
         * Identifier of a registration. Supported for 'RC/APNS' and 'RC/GCM' transport types
         */
        public String registrationId;
  public NotificationDeliveryModeRequest registrationId(String registrationId)
  {
    this.registrationId = registrationId;
    return this;
  }
  

        /**
         * Verification key of a subscription ensuring data security. Supported for 'Webhook' transport type
         */
        public String verificationToken;
  public NotificationDeliveryModeRequest verificationToken(String verificationToken)
  {
    this.verificationToken = verificationToken;
    return this;
  }
  
}
