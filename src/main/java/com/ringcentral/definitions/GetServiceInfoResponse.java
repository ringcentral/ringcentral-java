package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetServiceInfoResponse
{
    // Canonical URI of the account Service Info resource
    public String uri;
    public GetServiceInfoResponse uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Account Service Plan name
    public String servicePlanName;
    public GetServiceInfoResponse servicePlanName(String servicePlanName) {
        this.servicePlanName = servicePlanName;
        return this;
    }
    // Service features information, see Service Feature List
    public ServiceFeatureInfo[] serviceFeatures;
    public GetServiceInfoResponse serviceFeatures(ServiceFeatureInfo[] serviceFeatures) {
        this.serviceFeatures = serviceFeatures;
        return this;
    }
    // Limits which are effective for the account
    public AccountLimits limits;
    public GetServiceInfoResponse limits(AccountLimits limits) {
        this.limits = limits;
        return this;
    }
}
