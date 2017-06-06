package com.ringcentral.paths;

import com.ringcentral.definitions.CallLogRecord;
import com.ringcentral.definitions.SyncInfo;

public class CallLogSync {
    public static class ListParameters {
        // Type of synchronization. 'FSync' is a default value
        public String syncType;
        // Value of syncToken property of last sync request response
        public String syncToken;
        // The start datetime for resulting records in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is the current moment
        public String dateFrom;
        // For FSync the parameter is mandatory, it limits the number of records to be returned in response. For ISync it specifies with how many records to extend sync Frame to the past, the maximum number of records is 250
        public Long recordCount;
        // Type of calls to be returned. The default value is 'All'
        public String statusGroup;

        public ListParameters syncType(String syncType) {
            this.syncType = syncType;
            return this;
        }

        public ListParameters syncToken(String syncToken) {
            this.syncToken = syncToken;
            return this;
        }

        public ListParameters dateFrom(String dateFrom) {
            this.dateFrom = dateFrom;
            return this;
        }

        public ListParameters recordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }

        public ListParameters statusGroup(String statusGroup) {
            this.statusGroup = statusGroup;
            return this;
        }
    }

    public static class ListResponse {
        // List of call log records with synchronization information. For ISync the total number of returned records is limited to 250; this includes both new records and the old ones, specified by the recordCount parameter
        public CallLogRecord[] records;
        // Sync type, token and time
        public SyncInfo syncInfo;

        public ListResponse records(CallLogRecord[] records) {
            this.records = records;
            return this;
        }

        public ListResponse syncInfo(SyncInfo syncInfo) {
            this.syncInfo = syncInfo;
            return this;
        }
    }
}
