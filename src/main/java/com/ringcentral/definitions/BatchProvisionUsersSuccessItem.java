package com.ringcentral.definitions;


public class BatchProvisionUsersSuccessItem {
    /**
     * Indicates if the provisioning operation was successful for this item, always `true` in this model
     * Required
     * Example: true
     */
    public Boolean successful;
    /**
     * Required
     */
    public BatchProvisionUsersSuccessItemExtension extension;

    public BatchProvisionUsersSuccessItem successful(Boolean successful) {
        this.successful = successful;
        return this;
    }

    public BatchProvisionUsersSuccessItem extension(BatchProvisionUsersSuccessItemExtension extension) {
        this.extension = extension;
        return this;
    }
}
