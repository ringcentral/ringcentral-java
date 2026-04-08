package com.ringcentral.definitions;


public class GetLocationDeletionMultiResponse
{
    /**
     * Enum: Forbidden, Restricted, Allowed
     */
    public String deletion;
    public GetLocationDeletionMultiResponse deletion(String deletion)
    {
        this.deletion = deletion;
        return this;
    }

    /**
     * Enum: Forbidden, Allowed
     */
    public String reassignment;
    public GetLocationDeletionMultiResponse reassignment(String reassignment)
    {
        this.reassignment = reassignment;
        return this;
    }

    /**
     */
    public LocationDeletionInfo[] emergencyLocations;
    public GetLocationDeletionMultiResponse emergencyLocations(LocationDeletionInfo[] emergencyLocations)
    {
        this.emergencyLocations = emergencyLocations;
        return this;
    }
}