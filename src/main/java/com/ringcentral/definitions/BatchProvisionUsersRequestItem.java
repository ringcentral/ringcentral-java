package com.ringcentral.definitions;


/**
 * Describes request for user extension provisioning
 */
public class BatchProvisionUsersRequestItem {
    /**
     * Short number of an extension.
     * Actual max length depends on system length limit for extension.
     * Example: 205
     */
    public String extensionNumber;
    /**
     * Extension status. Only &quot;Enabled&quot; can be specified
     * Required
     * Default: Enabled
     * Enum: Enabled
     */
    public String status;
    /**
     * Personal contact information
     * Required
     */
    public BatchProvisionUsersRequestItemContact contact;
    /**
     *
     */
    public BatchProvisionUsersRequestItemCostCenter costCenter;
    /**
     *
     */
    public BatchProvisionUsersRequestItemRoles[] roles;
    /**
     *
     */
    public BatchProvisionUsersRequestItemDevices[] devices;

    public BatchProvisionUsersRequestItem extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public BatchProvisionUsersRequestItem status(String status) {
        this.status = status;
        return this;
    }

    public BatchProvisionUsersRequestItem contact(BatchProvisionUsersRequestItemContact contact) {
        this.contact = contact;
        return this;
    }

    public BatchProvisionUsersRequestItem costCenter(BatchProvisionUsersRequestItemCostCenter costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    public BatchProvisionUsersRequestItem roles(BatchProvisionUsersRequestItemRoles[] roles) {
        this.roles = roles;
        return this;
    }

    public BatchProvisionUsersRequestItem devices(BatchProvisionUsersRequestItemDevices[] devices) {
        this.devices = devices;
        return this;
    }
}
