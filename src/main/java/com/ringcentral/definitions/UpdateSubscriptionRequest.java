package com.ringcentral.definitions;


public class UpdateSubscriptionRequest {
    /**
     * The list of event filters corresponding to events the user is subscribed to
     * Required
     */
    public String[] eventFilters;
    /**
     * Subscription lifetime in seconds. For &quot;WebHook&quot; transport type max value might be set up to 315360000
     * seconds (10 years). For &quot;RC/APNS&quot; and &quot;RC/GSM&quot; transport types max subscription lifetime is 7776000 seconds (90 days).
     * For &quot;PubNub&quot; transport type the max value is 900 seconds (15 minutes)
     * Format: int32
     */
    public Long expiresIn;

    public UpdateSubscriptionRequest eventFilters(String[] eventFilters) {
        this.eventFilters = eventFilters;
        return this;
    }

    public UpdateSubscriptionRequest expiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
}
