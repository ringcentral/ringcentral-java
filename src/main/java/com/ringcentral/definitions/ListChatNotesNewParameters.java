package com.ringcentral.definitions;


/**
 * Query parameters for operation listChatNotesNew
 */
public class ListChatNotesNewParameters {
    /**
     * The end datetime for resulting records in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
     * format including timezone, e.g. 2019-03-10T18:23:45. The default value is
     * Now.
     */
    public String creationTimeTo;
    /**
     * The start datetime for resulting records in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
     * format including timezone
     */
    public String creationTimeFrom;
    /**
     * Internal identifier of the user that created the note. Multiple
     * values are supported
     */
    public String creatorId;
    /**
     * Status of notes to be fetched; if not specified all notes are
     * fetched by default.
     * Enum: Active, Draft
     */
    public String status;
    /**
     * Pagination token
     */
    public String pageToken;
    /**
     * Max number of notes to be fetched by one request; the value range is 1-250.
     * Maximum: 250
     * Format: int32
     * Default: 30
     */
    public Long recordCount;

    public ListChatNotesNewParameters creationTimeTo(String creationTimeTo) {
        this.creationTimeTo = creationTimeTo;
        return this;
    }

    public ListChatNotesNewParameters creationTimeFrom(String creationTimeFrom) {
        this.creationTimeFrom = creationTimeFrom;
        return this;
    }

    public ListChatNotesNewParameters creatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    public ListChatNotesNewParameters status(String status) {
        this.status = status;
        return this;
    }

    public ListChatNotesNewParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public ListChatNotesNewParameters recordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }
}
