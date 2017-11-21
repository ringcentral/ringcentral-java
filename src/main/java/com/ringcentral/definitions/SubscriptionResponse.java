package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SubscriptionResponse
{
    //
    public String uri;
    public SubscriptionResponse uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public SubscriptionResponse id(String id) {
        this.id = id;
        return this;
    }
    //
    public String creationTime;
    public SubscriptionResponse creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    //
    public String status;
    public SubscriptionResponse status(String status) {
        this.status = status;
        return this;
    }
    //
    public String[] eventFilters;
    public SubscriptionResponse eventFilters(String[] eventFilters) {
        this.eventFilters = eventFilters;
        return this;
    }
    //
    public String expirationTime;
    public SubscriptionResponse expirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    //
    public Long expiresIn;
    public SubscriptionResponse expiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
    //
    public DeliveryModeResource deliveryMode;
    public SubscriptionResponse deliveryMode(DeliveryModeResource deliveryMode) {
        this.deliveryMode = deliveryMode;
        return this;
    }
}
