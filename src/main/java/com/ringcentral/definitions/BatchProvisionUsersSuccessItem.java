package com.ringcentral.definitions;


public class BatchProvisionUsersSuccessItem
{
    /**
     * Indicates if the provisioning operation was successful for this item, always `true` in this model
     * Required
     * Example: true
     */
    public Boolean successful;
    public BatchProvisionUsersSuccessItem successful(Boolean successful)
    {
        this.successful = successful;
        return this;
    }

    /**
     * Required
     */
    public BatchProvisionUsersSuccessItemExtension extension;
    public BatchProvisionUsersSuccessItem extension(BatchProvisionUsersSuccessItemExtension extension)
    {
        this.extension = extension;
        return this;
    }
}