package com.ringcentral.definitions;


public class BulkManageLicensesResponse {
    /**
     *
     */
    public LicenseAssignmentResponseEntry[] assignedLicenses;
    /**
     *
     */
    public LicenseAssignmentResponseEntry[] unassignedLicenses;

    public BulkManageLicensesResponse assignedLicenses(LicenseAssignmentResponseEntry[] assignedLicenses) {
        this.assignedLicenses = assignedLicenses;
        return this;
    }

    public BulkManageLicensesResponse unassignedLicenses(LicenseAssignmentResponseEntry[] unassignedLicenses) {
        this.unassignedLicenses = unassignedLicenses;
        return this;
    }
}
