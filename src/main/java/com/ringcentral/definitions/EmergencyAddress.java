package com.ringcentral.definitions;


public class EmergencyAddress {
    /**
     * &#039;True&#039; if specifying of emergency address is required
     */
    public Boolean required;
    /**
     * &#039;True&#039; if only local emergency address can be specified
     */
    public Boolean localOnly;

    public EmergencyAddress required(Boolean required) {
        this.required = required;
        return this;
    }

    public EmergencyAddress localOnly(Boolean localOnly) {
        this.localOnly = localOnly;
        return this;
    }
}
