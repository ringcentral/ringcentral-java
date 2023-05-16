package com.ringcentral.definitions;


public class BatchProvisionErrorItem {
    /**
     * Indicates if the provisioning operation was successful for this item, always `false` in this model
     * Required
     */
    public Boolean successful;
    /**
     * Required
     */
    public ApiErrorWithParameter[] errors;

    public BatchProvisionErrorItem successful(Boolean successful) {
        this.successful = successful;
        return this;
    }

    public BatchProvisionErrorItem errors(ApiErrorWithParameter[] errors) {
        this.errors = errors;
        return this;
    }
}
