package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SubscriptionInfo
{
    // Internal identifier of a subscription
    public String id;
    public SubscriptionInfo id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of a subscription
    public String uri;
    public SubscriptionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Collection of URIs to API resources (message-store/presence/detailed presence)
    public String[] eventFilters;
    public SubscriptionInfo eventFilters(String[] eventFilters) {
        this.eventFilters = eventFilters;
        return this;
    }
    // Subscription expiration datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String expirationTime;
    public SubscriptionInfo expirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    // Subscription lifetime in seconds. The default value is 900
    public Long expiresIn;
    public SubscriptionInfo expiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
    // Subscription status
    public String status;
    public SubscriptionInfo status(String status) {
        this.status = status;
        return this;
    }
    // Subscription creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String creationTime;
    public SubscriptionInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    // Delivery mode data
    public NotificationDeliveryMode deliveryMode;
    public SubscriptionInfo deliveryMode(NotificationDeliveryMode deliveryMode) {
        this.deliveryMode = deliveryMode;
        return this;
    }
}
