package com.ringcentral.definitions;


public class ForwardAllCompanyCallsRequest {
    /**
     * Indicates whether the *Forward All Company Calls* feature is enabled or disabled for an account
     * Required
     */
    public Boolean enabled;

    public ForwardAllCompanyCallsRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
