package com.ringcentral.definitions;


/**
 * Query parameters for operation syncAccountCallLog
 */
public class SyncAccountCallLogParameters {
    /**
     * Type of call log synchronization request: full or incremental sync
     * Default: FSync
     * Enum: FSync, ISync
     */
    public String syncType;
    /**
     * Value of syncToken property of last sync request response. Mandatory parameter for &#039;ISync&#039; sync type
     */
    public String syncToken;
    /**
     * Starting date for the resulting records in ISO 8601 format, including
     * timezone, for example *2016-03-10T18:07:52.534Z*. The range is limited to the last 30 days from the current moment.
     * If not specified, the default value is a log history date (date of account creation/call log deletion), and
     * no time range limitation applied
     * Format: date-time
     */
    public String dateFrom;
    /**
     * For `FSync` mode this parameter is mandatory, it limits the number of records to be returned in response.
     * <p>
     * For `ISync` mode this parameter specifies the number of records to extend the sync frame with to the past
     * (the maximum number of records is 250)
     * Minimum: 1
     * Format: int32
     */
    public Long recordCount;
    /**
     * Type of calls to be returned
     * Enum: Missed, All
     */
    public String[] statusGroup;
    /**
     * Defines the level of details for returned call records
     * Default: Simple
     * Enum: Simple, Detailed
     */
    public String view;
    /**
     * Supported for `ISync` mode. Indicates that deleted call records should be returned
     */
    public Boolean showDeleted;
    /**
     * Deprecated, replaced with `recordingType` filter, still supported for compatibility reasons.
     * Indicates if only recorded calls should be returned.
     * <p>
     * If both `withRecording` and `recordingType` parameters are specified, then `withRecording` is ignored
     */
    public Boolean withRecording;
    /**
     * Indicates that call records with recordings of particular type should be returned.
     * If omitted, then calls with and without recordings are returned
     * Enum: Automatic, OnDemand, All
     */
    public String recordingType;

    public SyncAccountCallLogParameters syncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    public SyncAccountCallLogParameters syncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }

    public SyncAccountCallLogParameters dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public SyncAccountCallLogParameters recordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }

    public SyncAccountCallLogParameters statusGroup(String[] statusGroup) {
        this.statusGroup = statusGroup;
        return this;
    }

    public SyncAccountCallLogParameters view(String view) {
        this.view = view;
        return this;
    }

    public SyncAccountCallLogParameters showDeleted(Boolean showDeleted) {
        this.showDeleted = showDeleted;
        return this;
    }

    public SyncAccountCallLogParameters withRecording(Boolean withRecording) {
        this.withRecording = withRecording;
        return this;
    }

    public SyncAccountCallLogParameters recordingType(String recordingType) {
        this.recordingType = recordingType;
        return this;
    }
}
