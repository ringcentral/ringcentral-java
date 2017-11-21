package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SubscriptionRequest
{
    //
    public String[] eventFilters;
    public SubscriptionRequest eventFilters(String[] eventFilters) {
        this.eventFilters = eventFilters;
        return this;
    }
    //
    public DeliveryModeResource deliveryMode;
    public SubscriptionRequest deliveryMode(DeliveryModeResource deliveryMode) {
        this.deliveryMode = deliveryMode;
        return this;
    }
    //
    public Long expiresIn;
    public SubscriptionRequest expiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
}
