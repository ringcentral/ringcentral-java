package com.ringcentral.definitions;


public class UpdateSubscriptionRequest {
    /**
     * The list of event filters corresponding to events the user is subscribed to
     * Required
     */
    public String[] eventFilters;
    /**
     * Subscription lifetime in seconds. The maximum subscription lifetime depends upon the specified `transportType`:
     * <p>
     * | Transport type      | Maximum permitted lifetime     |
     * | ------------------- | ------------------------------ |
     * | `WebHook`           | 315360000 seconds (10 years)   |
     * | `RC/APNS`, `RC/GSM` | 7776000 seconds (90 days)      |
     * | `WebSocket`         | n/a (the parameter is ignored) |
     * Minimum: 1
     * Format: int32
     * Example: 1200
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
