package com.ringcentral.definitions;


/**
 * Query parameters for operation deleteEmergencyLocation
 */
public class DeleteEmergencyLocationParameters {
    /**
     * Flag indicating that validation of emergency location(s) is required
     * before deletion
     */
    public Boolean validateOnly;
    /**
     * Internal identifier of an emergency response location
     * that should be used instead of a deleted one.
     */
    public String newLocationId;

    public DeleteEmergencyLocationParameters validateOnly(Boolean validateOnly) {
        this.validateOnly = validateOnly;
        return this;
    }

    public DeleteEmergencyLocationParameters newLocationId(String newLocationId) {
        this.newLocationId = newLocationId;
        return this;
    }
}
