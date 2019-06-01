package com.ringcentral.definitions;


public class ModifySubscriptionRequest {
    /**
     * Collection of URIs to API resources
     * Required
     */
    public String[] eventFilters;
    /**
     * Notification delivery settings
     */
    public NotificationDeliveryModeRequest deliveryMode;
    /**
     * Subscription lifetime in seconds. Max value is 7 days (604800 sec). For *WebHook* transport type max value might be set up to 630720000 seconds (20 years)
     * Default: 604800
     */
    public Long expiresIn;

    public ModifySubscriptionRequest eventFilters(String[] eventFilters) {
        this.eventFilters = eventFilters;
        return this;
    }

    public ModifySubscriptionRequest deliveryMode(NotificationDeliveryModeRequest deliveryMode) {
        this.deliveryMode = deliveryMode;
        return this;
    }

    public ModifySubscriptionRequest expiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

}
