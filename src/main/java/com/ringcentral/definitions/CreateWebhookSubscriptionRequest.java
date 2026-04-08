package com.ringcentral.definitions;


public class CreateWebhookSubscriptionRequest
{
    /**
     * The list of event filters corresponding to events the user is subscribed to
     * Required
     */
    public String[] eventFilters;
    public CreateWebhookSubscriptionRequest eventFilters(String[] eventFilters)
    {
        this.eventFilters = eventFilters;
        return this;
    }

    /**
     * Subscription lifetime in seconds. The maximum subscription lifetime depends upon the specified `transportType`:
    * 
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
    public CreateWebhookSubscriptionRequest expiresIn(Long expiresIn)
    {
        this.expiresIn = expiresIn;
        return this;
    }

    /**
     * Required
     */
    public WebhookDeliveryModeRequest deliveryMode;
    public CreateWebhookSubscriptionRequest deliveryMode(WebhookDeliveryModeRequest deliveryMode)
    {
        this.deliveryMode = deliveryMode;
        return this;
    }
}