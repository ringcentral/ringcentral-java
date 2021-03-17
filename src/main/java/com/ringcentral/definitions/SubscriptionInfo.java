package com.ringcentral.definitions;


public class SubscriptionInfo
{
    /**
         * Internal identifier of a subscription
         */
        public String id;
  public SubscriptionInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Canonical URI of a subscription
         */
        public String uri;
  public SubscriptionInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Collection of API resources (message-store/presence/detailed presence) corresponding to events the user is subscribed to
         */
        public String[] eventFilters;
  public SubscriptionInfo eventFilters(String[] eventFilters)
  {
    this.eventFilters = eventFilters;
    return this;
  }
  

        /**
         * Collection of API resources (message-store/presence/detailed presence) corresponding to events the user is not subscribed to due to certain limitations
         */
        public DisabledFilterInfo[] disabledFilters;
  public SubscriptionInfo disabledFilters(DisabledFilterInfo[] disabledFilters)
  {
    this.disabledFilters = disabledFilters;
    return this;
  }
  

        /**
         * Subscription expiration datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example 2016-03-10T18:07:52.534Z
         */
        public String expirationTime;
  public SubscriptionInfo expirationTime(String expirationTime)
  {
    this.expirationTime = expirationTime;
    return this;
  }
  

        /**
         * Subscription lifetime in seconds
         */
        public Long expiresIn;
  public SubscriptionInfo expiresIn(Long expiresIn)
  {
    this.expiresIn = expiresIn;
    return this;
  }
  

        /**
         * Subscription status
         * Enum: Active, Suspended, Blacklisted
         */
        public String status;
  public SubscriptionInfo status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * Subscription creation datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example 2016-03-10T18:07:52.534Z
         */
        public String creationTime;
  public SubscriptionInfo creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         * Required
         */
        public NotificationDeliveryMode deliveryMode;
  public SubscriptionInfo deliveryMode(NotificationDeliveryMode deliveryMode)
  {
    this.deliveryMode = deliveryMode;
    return this;
  }
  

        /**
         */
        public NotificationBlacklistedData blacklistedData;
  public SubscriptionInfo blacklistedData(NotificationBlacklistedData blacklistedData)
  {
    this.blacklistedData = blacklistedData;
    return this;
  }
  

        /**
         * Notifications transportation provider name
         * Enum: PubNub, WebHook, RC/APNS, RC/GCM
         */
        public String transportType;
  public SubscriptionInfo transportType(String transportType)
  {
    this.transportType = transportType;
    return this;
  }
  

        /**
         * Name of a certificate. Supported for 'RC/APNS' and 'RC/GCM' transport types
         */
        public String certificateName;
  public SubscriptionInfo certificateName(String certificateName)
  {
    this.certificateName = certificateName;
    return this;
  }
  

        /**
         * Identifier of a registration. Supported for 'RC/APNS' and 'RC/GCM' transport types
         */
        public String registrationId;
  public SubscriptionInfo registrationId(String registrationId)
  {
    this.registrationId = registrationId;
    return this;
  }
  
}
