package com.ringcentral.definitions;


// Query parameters for operation deleteExtensionEmergencyLocation
public class DeleteExtensionEmergencyLocationParameters {
    /**
     * Flag indicating that only validation of Emergency Response Locations to be deleted is required.
     */
    public Boolean validateOnly;

    public DeleteExtensionEmergencyLocationParameters validateOnly(Boolean validateOnly) {
        this.validateOnly = validateOnly;
        return this;
    }
}
