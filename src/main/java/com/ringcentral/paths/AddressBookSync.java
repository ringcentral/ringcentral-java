package com.ringcentral.paths;

import com.ringcentral.RequestParameters;
import com.ringcentral.definitions.PersonalContactInfo;
import com.ringcentral.definitions.SyncInfo;

public class AddressBookSync {
    public static class ListParameters implements RequestParameters {
        // Type of synchronization. The default value is 'FSync'
        public String syncType;
        // Value of syncToken property of the last sync request response
        public String syncToken;
        // Number of records per page to be returned. The max number of records is 250, which is also the default. For FSync — if the number of records exceeds the parameter value (either specified or default), all of the pages can be retrieved in several requests. For ISync — if the number of records exceeds the page size, the number of incoming changes to this number is limited
        public Long perPage;
        // Internal identifier of a page. It can be obtained from the 'nextPageId' parameter passed in response body
        public Long pageId;

        public ListParameters syncType(String syncType) {
            this.syncType = syncType;
            return this;
        }

        public ListParameters syncToken(String syncToken) {
            this.syncToken = syncToken;
            return this;
        }

        public ListParameters perPage(Long perPage) {
            this.perPage = perPage;
            return this;
        }

        public ListParameters pageId(Long pageId) {
            this.pageId = pageId;
            return this;
        }
    }

    public static class ListResponse implements RequestParameters {
        // List of contacts with synchronization information
        public PersonalContactInfo[] records;
        // Sync type, token and time
        public SyncInfo syncInfo;
        // Internal identifier of the next page, if any
        public Long nextPageId;
        // URL of the next page, if any
        public String nextPageUri;

        public ListResponse records(PersonalContactInfo[] records) {
            this.records = records;
            return this;
        }

        public ListResponse syncInfo(SyncInfo syncInfo) {
            this.syncInfo = syncInfo;
            return this;
        }

        public ListResponse nextPageId(Long nextPageId) {
            this.nextPageId = nextPageId;
            return this;
        }

        public ListResponse nextPageUri(String nextPageUri) {
            this.nextPageUri = nextPageUri;
            return this;
        }
    }
}
