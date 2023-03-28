package com.ringcentral.definitions;


public class EmergencyAddress {
    /**
     * If set to &#039;True&#039; then specifying emergency address is required
     */
    public Boolean required;
    /**
     * If set to &#039;True&#039; then only local emergency address can be specified
     */
    public Boolean localOnly;
    /**
     * This status is associated with a phone line provision state
     * Enum: Valid, Provisioning, Invalid
     */
    public String lineProvisioningStatus;

    public EmergencyAddress required(Boolean required) {
        this.required = required;
        return this;
    }

    public EmergencyAddress localOnly(Boolean localOnly) {
        this.localOnly = localOnly;
        return this;
    }

    public EmergencyAddress lineProvisioningStatus(String lineProvisioningStatus) {
        this.lineProvisioningStatus = lineProvisioningStatus;
        return this;
    }
}
