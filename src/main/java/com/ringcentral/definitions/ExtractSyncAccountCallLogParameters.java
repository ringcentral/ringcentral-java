package com.ringcentral.definitions;

/** Query parameters for operation extractSyncAccountCallLog */
public class ExtractSyncAccountCallLogParameters {
    /**
     * Type of call log synchronization request - full or incremental sync Default: FSync Enum:
     * FSync, ISync
     */
    public String syncType;

    public ExtractSyncAccountCallLogParameters syncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    /**
     * Value of `syncToken` property of the last extract-sync request response. Mandatory for
     * &#039;ISync&#039; type
     */
    public String syncToken;

    public ExtractSyncAccountCallLogParameters syncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }

    /**
     * Starting datetime for resulting records in ISO 8601 format including timezone, for example
     * 2016-03-10T18:07:52.534Z. The default value is one hour before the current moment Format:
     * date-time
     */
    public String dateFrom;

    public ExtractSyncAccountCallLogParameters dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    /**
     * Allowed for `FSync` mode only. It limits the number of records to be returned in response
     * (the maximum number of records is 1000, the default value is 250).
     *
     * <p>Actual number of calls could extend the limit in case there are several calls at
     * borderline modification time (millisecond precision). Minimum: 1 Format: int32 Default: 250
     */
    public Long recordCount;

    public ExtractSyncAccountCallLogParameters recordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }

    /**
     * Defines the level of details for returned call records Default: Simple Enum: Simple, Detailed
     */
    public String view;

    public ExtractSyncAccountCallLogParameters view(String view) {
        this.view = view;
        return this;
    }

    /**
     * Category of metadata to be returned. If omitted, all call records are returned. Multiple
     * values are supported
     */
    public String[] metadataCategory;

    public ExtractSyncAccountCallLogParameters metadataCategory(String[] metadataCategory) {
        this.metadataCategory = metadataCategory;
        return this;
    }
}
