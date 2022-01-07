package com.ringcentral.definitions;


public class CreateSubscriptionRequest {
    /**
     * Collection of URIs to API resources
     * Required
     */
    public String[] eventFilters;
    /**
     * Required
     */
    public NotificationDeliveryModeRequest deliveryMode;
    /**
     * Subscription lifetime in seconds. For *WebHook* transport type max value might be set up to 630720000 seconds (20 years). For RC/APNS and RC/GSM transport max subscription lifetime is 7776000 seconds (90 days). For PubNub transport the max value is 900 seconds (15 minutes)
     */
    public Long expiresIn;

    public CreateSubscriptionRequest eventFilters(String[] eventFilters) {
        this.eventFilters = eventFilters;
        return this;
    }

    public CreateSubscriptionRequest deliveryMode(NotificationDeliveryModeRequest deliveryMode) {
        this.deliveryMode = deliveryMode;
        return this;
    }

    public CreateSubscriptionRequest expiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
}
