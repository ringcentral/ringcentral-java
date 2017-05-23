package com.ringcentral.definitions;

public class SubscriptionInfo {
    // Internal identifier of a subscription
    public String id;
    // Canonical URI of a subscription
    public String uri;
    // Collection of URIs to API resources (message-store/presence/detailed presence)
    public String[] eventFilters;
    // Subscription expiration datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String expirationTime;
    // Subscription lifetime in seconds. The default value is 900
    public Long expiresIn;
    // Subscription status
    public String status;
    // Subscription creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String creationTime;
    // Delivery mode data
    public DeliveryMode deliveryMode;
}
