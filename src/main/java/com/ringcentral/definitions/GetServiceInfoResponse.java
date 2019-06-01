package com.ringcentral.definitions;


public class GetServiceInfoResponse {
    /**
     * Canonical URI of the account Service Info resource
     */
    public String uri;
    /**
     * Account Service Plan name
     */
    public String servicePlanName;
    /**
     * Service features information, see Service Feature List
     */
    public ServiceFeatureInfo[] serviceFeatures;
    /**
     * Limits which are effective for the account
     */
    public AccountLimits limits;

    public GetServiceInfoResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetServiceInfoResponse servicePlanName(String servicePlanName) {
        this.servicePlanName = servicePlanName;
        return this;
    }

    public GetServiceInfoResponse serviceFeatures(ServiceFeatureInfo[] serviceFeatures) {
        this.serviceFeatures = serviceFeatures;
        return this;
    }

    public GetServiceInfoResponse limits(AccountLimits limits) {
        this.limits = limits;
        return this;
    }

}
