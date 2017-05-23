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

    public SubscriptionInfo id(String id) {
        this.id = id;
        return this;
    }

    public SubscriptionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public SubscriptionInfo eventFilters(String[] eventFilters) {
        this.eventFilters = eventFilters;
        return this;
    }

    public SubscriptionInfo expirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    public SubscriptionInfo expiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    public SubscriptionInfo status(String status) {
        this.status = status;
        return this;
    }

    public SubscriptionInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public SubscriptionInfo deliveryMode(DeliveryMode deliveryMode) {
        this.deliveryMode = deliveryMode;
        return this;
    }
}
