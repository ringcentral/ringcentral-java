package com.ringcentral.definitions;


public class ModifySubscriptionRequest {
    /**
     * Collection of URIs to API resources
     * Required
     */
    public String[] eventFilters;
    /**
     * Subscription lifetime in seconds. Max value is 7 days (604800 sec). For *WebHook* transport type max value might be set up to 315360000 seconds (10 years)
     */
    public Long expiresIn;

    public ModifySubscriptionRequest eventFilters(String[] eventFilters) {
        this.eventFilters = eventFilters;
        return this;
    }

    public ModifySubscriptionRequest expiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
}
