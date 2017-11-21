package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class CallLogSync extends Path {
    public CallLogSync (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "call-log-sync", id);
    }
    public static class GetParameters
    {
        // Type of synchronization. 'FSync' is a default value
        public String[] syncType;
        public GetParameters syncType(String[] syncType) {
            this.syncType = syncType;
            return this;
        }
        // Value of syncToken property of last sync request response
        public String syncToken;
        public GetParameters syncToken(String syncToken) {
            this.syncToken = syncToken;
            return this;
        }
        // The start datetime for resulting records in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is the current moment
        public String dateFrom;
        public GetParameters dateFrom(String dateFrom) {
            this.dateFrom = dateFrom;
            return this;
        }
        // ForT?FSync the parameter is mandatory, it limits the number of records to be returned in response. For ISync it specifies with how many records to extend sync Frame to the past, the maximum number of records is 250
        public Long recordCount;
        public GetParameters recordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        // Type of calls to be returned. The default value is 'All'
        public String[] statusGroup;
        public GetParameters statusGroup(String[] statusGroup) {
            this.statusGroup = statusGroup;
            return this;
        }
    }
}
