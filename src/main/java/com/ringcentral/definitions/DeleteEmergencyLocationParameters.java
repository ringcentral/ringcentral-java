package com.ringcentral.definitions;


// Query parameters for operation deleteEmergencyLocation
public class DeleteEmergencyLocationParameters {
    /**
     * Internal identifier of a location that should be used instead of a deleted one
     */
    public String newLocationId;
    /**
     * Flag indicating that validation of emergency location(s) is required before deletion
     */
    public Boolean validateOnly;

    public DeleteEmergencyLocationParameters newLocationId(String newLocationId) {
        this.newLocationId = newLocationId;
        return this;
    }

    public DeleteEmergencyLocationParameters validateOnly(Boolean validateOnly) {
        this.validateOnly = validateOnly;
        return this;
    }
}
