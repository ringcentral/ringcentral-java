package com.ringcentral.definitions;

/** Recording information */
public class Recording {
    /** Recording id Required */
    public String id;

    public Recording id(String id) {
        this.id = id;
        return this;
    }

    /** Recording start time Format: int64 */
    public Long startTime;

    public Recording startTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /** Secure Link to the recording file */
    public String url;

    public Recording url(String url) {
        this.url = url;
        return this;
    }

    /** */
    public JsValue metadata;

    public Recording metadata(JsValue metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Recording processing status Enum: Processing, Processed, Error, Corrupted, InProgress,
     * Purged, Failed
     */
    public String status;

    public Recording status(String status) {
        this.status = status;
        return this;
    }

    /** Availability status Required Enum: Alive, Deleted, Purged, NotAvailable */
    public String availabilityStatus;

    public Recording availabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
        return this;
    }

    /**
     * During meeting AI team analyze code and after meeting finished generates text summary about
     * this meeting
     */
    public String longSummary;

    public Recording longSummary(String longSummary) {
        this.longSummary = longSummary;
        return this;
    }

    /**
     * During meeting AI team analyze code and after meeting finished generates text summary about
     * this meeting
     */
    public String shortSummary;

    public Recording shortSummary(String shortSummary) {
        this.shortSummary = shortSummary;
        return this;
    }

    /**
     * During meeting AI team analyze code and after meeting finished generates key words used in
     * meeting
     */
    public String[] keywords;

    public Recording keywords(String[] keywords) {
        this.keywords = keywords;
        return this;
    }
}
