package com.ringcentral.definitions;


/**
 * Recording information
 */
public class Recording {
    /**
     * recording id
     */
    public String id;
    /**
     * recording start time
     * Format: int64
     */
    public Long startTime;
    /**
     * recording url
     */
    public String contentUri;
    /**
     *
     */
    public JsValue metadata;
    /**
     * recording status
     * Enum: Processing, Processed, Error, Corrupted, InProgress
     */
    public String status;
    /**
     * availability status
     * Required
     * Enum: Alive, Deleted, Purged, NotAvailable
     */
    public String availabilityStatus;

    public Recording id(String id) {
        this.id = id;
        return this;
    }

    public Recording startTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    public Recording contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

    public Recording metadata(JsValue metadata) {
        this.metadata = metadata;
        return this;
    }

    public Recording status(String status) {
        this.status = status;
        return this;
    }

    public Recording availabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
        return this;
    }
}
