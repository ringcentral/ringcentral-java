package com.ringcentral.definitions;


public class EmergencyAddress {
    /**
     * 'True' if specifying of emergency address is required
     */
    public Boolean required;
    /**
     * 'True' if only local emergency address can be specified
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
