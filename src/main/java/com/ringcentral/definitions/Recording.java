package com.ringcentral.definitions;


/**
 * Recording information
 */
public class Recording {
    /**
     * Recording id
     * Required
     */
    public String id;
    /**
     * Recording start time
     * Format: int64
     */
    public Long startTime;
    /**
     * Secure Link to the recording file
     */
    public String url;
    /**
     *
     */
    public JsValue metadata;
    /**
     * Recording processing status
     * Enum: Processing, Processed, Error, Corrupted, InProgress, Purged, Failed
     */
    public String status;
    /**
     * Availability status
     * Required
     * Enum: Alive, Deleted, Purged, NotAvailable
     */
    public String availabilityStatus;
    /**
     * During meeting AI team analyze code and after meeting finished generates text summary about this meeting
     */
    public String longSummary;
    /**
     * During meeting AI team analyze code and after meeting finished generates text summary about this meeting
     */
    public String shortSummary;
    /**
     * During meeting AI team analyze code and after meeting finished generates key words used in meeting
     */
    public String[] keywords;

    public Recording id(String id) {
        this.id = id;
        return this;
    }

    public Recording startTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    public Recording url(String url) {
        this.url = url;
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

    public Recording longSummary(String longSummary) {
        this.longSummary = longSummary;
        return this;
    }

    public Recording shortSummary(String shortSummary) {
        this.shortSummary = shortSummary;
        return this;
    }

    public Recording keywords(String[] keywords) {
        this.keywords = keywords;
        return this;
    }
}
