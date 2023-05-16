package com.ringcentral.definitions;


/**
 * Request to assign/unassign licenses
 */
public class BulkManageLicensesRequest {
    /**
     *
     */
    public LicenseAssignmentEntry[] assignedLicenses;
    /**
     *
     */
    public LicenseAssignmentEntry[] unassignedLicenses;

    public BulkManageLicensesRequest assignedLicenses(LicenseAssignmentEntry[] assignedLicenses) {
        this.assignedLicenses = assignedLicenses;
        return this;
    }

    public BulkManageLicensesRequest unassignedLicenses(LicenseAssignmentEntry[] unassignedLicenses) {
        this.unassignedLicenses = unassignedLicenses;
        return this;
    }
}
