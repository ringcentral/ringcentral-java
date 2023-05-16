package com.ringcentral.definitions;


public class BatchProvisionUsersResponseResults {
    /**
     * Indicates if the provisioning operation was successful for this item, always `false` in this model
     */
    public Boolean successful;
    /**
     *
     */
    public BatchProvisionUsersResponseResultsExtension extension;
    /**
     *
     */
    public ApiErrorWithParameter[] errors;

    public BatchProvisionUsersResponseResults successful(Boolean successful) {
        this.successful = successful;
        return this;
    }

    public BatchProvisionUsersResponseResults extension(BatchProvisionUsersResponseResultsExtension extension) {
        this.extension = extension;
        return this;
    }

    public BatchProvisionUsersResponseResults errors(ApiErrorWithParameter[] errors) {
        this.errors = errors;
        return this;
    }
}
