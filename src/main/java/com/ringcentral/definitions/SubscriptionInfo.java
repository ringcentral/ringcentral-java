package com.ringcentral.definitions;


public class SubscriptionInfo {
    /**
     * Canonical URI of a subscription resource
     * Required
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of a subscription
     * Required
     * Format: uuid
     * Example: 95fecfc9-9cdc-4e94-a78a-89fd65889d37
     */
    public String id;
    /**
     * The list of event filter names corresponding to events the user is subscribed to
     * Required
     */
    public String[] eventFilters;
    /**
     * The list of event filter names corresponding to events the user is not subscribed to due to
     * certain limitations
     */
    public DisabledFilterInfo[] disabledFilters;
    /**
     * Subscription expiration time in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
     * format including timezone, for example *2016-03-10T18:07:52.534Z*
     * Required
     * Format: date-time
     */
    public String expirationTime;
    /**
     * Subscription lifetime in seconds
     * Minimum: 1
     * Format: int32
     */
    public Long expiresIn;
    /**
     * Subscription status
     * Required
     * Enum: Active, Suspended, Blacklisted
     */
    public String status;
    /**
     * Subscription creation time in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
     * format including timezone, for example *2016-03-10T18:07:52.534*
     * Required
     * Format: date-time
     */
    public String creationTime;
    /**
     * Required
     */
    public NotificationDeliveryMode deliveryMode;
    /**
     * Returned if a WebHook subscription is blacklisted
     */
    public SubscriptionInfoBlacklistedData blacklistedData;

    public SubscriptionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public SubscriptionInfo id(String id) {
        this.id = id;
        return this;
    }

    public SubscriptionInfo eventFilters(String[] eventFilters) {
        this.eventFilters = eventFilters;
        return this;
    }

    public SubscriptionInfo disabledFilters(DisabledFilterInfo[] disabledFilters) {
        this.disabledFilters = disabledFilters;
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

    public SubscriptionInfo deliveryMode(NotificationDeliveryMode deliveryMode) {
        this.deliveryMode = deliveryMode;
        return this;
    }

    public SubscriptionInfo blacklistedData(SubscriptionInfoBlacklistedData blacklistedData) {
        this.blacklistedData = blacklistedData;
        return this;
    }
}
