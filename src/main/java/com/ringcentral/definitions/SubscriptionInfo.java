package com.ringcentral.definitions;


public class SubscriptionInfo
{
    /**
     * Canonical URI of a subscription resource
     * Required
     * Format: uri
     */
    public String uri;
    public SubscriptionInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Internal identifier of a subscription
     * Required
     */
    public String id;
    public SubscriptionInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * The list of event filter names corresponding to events the user is subscribed to
     * Required
     */
    public String[] eventFilters;
    public SubscriptionInfo eventFilters(String[] eventFilters)
    {
        this.eventFilters = eventFilters;
        return this;
    }

    /**
     * The list of event filter names corresponding to events the user is not subscribed to due to certain limitations
     */
    public DisabledFilterInfo[] disabledFilters;
    public SubscriptionInfo disabledFilters(DisabledFilterInfo[] disabledFilters)
    {
        this.disabledFilters = disabledFilters;
        return this;
    }

    /**
     * Subscription expiration datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z*
     * Required
     * Format: date-time
     */
    public String expirationTime;
    public SubscriptionInfo expirationTime(String expirationTime)
    {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * Subscription lifetime in seconds
     * Format: int32
     */
    public Long expiresIn;
    public SubscriptionInfo expiresIn(Long expiresIn)
    {
        this.expiresIn = expiresIn;
        return this;
    }

    /**
     * Subscription status
     * Required
     * Enum: Active, Suspended, Blacklisted
     */
    public String status;
    public SubscriptionInfo status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Subscription creation datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534*
     * Required
     * Format: date-time
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
     * Returned if a WebHook subscription is blacklisted
     */
    public SubscriptionInfoBlacklistedData blacklistedData;
    public SubscriptionInfo blacklistedData(SubscriptionInfoBlacklistedData blacklistedData)
    {
        this.blacklistedData = blacklistedData;
        return this;
    }
}