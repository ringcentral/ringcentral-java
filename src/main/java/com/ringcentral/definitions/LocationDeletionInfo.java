package com.ringcentral.definitions;


public class LocationDeletionInfo {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String name;
    /**
     * Identifies the possibility and status of emergency location
     * deletion
     * Enum: Failed, Completed, Forbidden, Restricted, Allowed
     */
    public String deletion;
    /**
     *
     */
    public LocationDeletionErrorInfo errors;

    public LocationDeletionInfo id(String id) {
        this.id = id;
        return this;
    }

    public LocationDeletionInfo name(String name) {
        this.name = name;
        return this;
    }

    public LocationDeletionInfo deletion(String deletion) {
        this.deletion = deletion;
        return this;
    }

    public LocationDeletionInfo errors(LocationDeletionErrorInfo errors) {
        this.errors = errors;
        return this;
    }
}
