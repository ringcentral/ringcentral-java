package com.ringcentral.definitions;


/**
 * Query parameters for operation syncUserCallLog
 */
public class SyncUserCallLogParameters {
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
     * The start datetime for resulting records in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is the current moment
     * Format: date-time
     */
    public String dateFrom;
    /**
     * For &#039;FSync&#039; the parameter is mandatory, it limits the number of records to be returned in response. For &#039;ISync&#039; it specifies with how many records to extend sync Frame to the past, the maximum number of records is 250
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

    public SyncUserCallLogParameters syncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    public SyncUserCallLogParameters syncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }

    public SyncUserCallLogParameters dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public SyncUserCallLogParameters recordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }

    public SyncUserCallLogParameters statusGroup(String[] statusGroup) {
        this.statusGroup = statusGroup;
        return this;
    }

    public SyncUserCallLogParameters view(String view) {
        this.view = view;
        return this;
    }

    public SyncUserCallLogParameters showDeleted(Boolean showDeleted) {
        this.showDeleted = showDeleted;
        return this;
    }

    public SyncUserCallLogParameters withRecording(Boolean withRecording) {
        this.withRecording = withRecording;
        return this;
    }

    public SyncUserCallLogParameters recordingType(String recordingType) {
        this.recordingType = recordingType;
        return this;
    }
}
