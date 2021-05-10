package com.ringcentral.definitions;


public class GetLocationDeletionMultiResponse {
    /**
     * Enum: Forbidden, Restricted, Allowed
     */
    public String deletion;
    /**
     * Enum: Forbidden, Allowed
     */
    public String reassignment;
    /**
     *
     */
    public LocationDeletionInfo[] emergencyLocations;

    public GetLocationDeletionMultiResponse deletion(String deletion) {
        this.deletion = deletion;
        return this;
    }

    public GetLocationDeletionMultiResponse reassignment(String reassignment) {
        this.reassignment = reassignment;
        return this;
    }

    public GetLocationDeletionMultiResponse emergencyLocations(LocationDeletionInfo[] emergencyLocations) {
        this.emergencyLocations = emergencyLocations;
        return this;
    }
}
