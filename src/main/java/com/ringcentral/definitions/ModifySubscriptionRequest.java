package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ModifySubscriptionRequest
{
    // Collection of URIs to API resources (see Event Types). Mandatory field
    public String[] eventFilters;
    public ModifySubscriptionRequest eventFilters(String[] eventFilters) {
        this.eventFilters = eventFilters;
        return this;
    }
}
