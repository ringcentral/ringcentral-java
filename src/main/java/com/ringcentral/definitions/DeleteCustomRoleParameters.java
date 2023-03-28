package com.ringcentral.definitions;


/**
 * Query parameters for operation deleteCustomRole
 */
public class DeleteCustomRoleParameters {
    /**
     * Specifies that role should be validated prior to deletion whether it can be deleted or not
     */
    public Boolean validateOnly;

    public DeleteCustomRoleParameters validateOnly(Boolean validateOnly) {
        this.validateOnly = validateOnly;
        return this;
    }
}
