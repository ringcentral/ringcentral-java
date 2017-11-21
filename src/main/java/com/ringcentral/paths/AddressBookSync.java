package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class AddressBookSync extends Path {
    public AddressBookSync (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "address-book-sync", id);
    }
    public static class GetParameters
    {
        // Type of synchronization. The default value is 'FSync'
        public String[] syncType;
        public GetParameters syncType(String[] syncType) {
            this.syncType = syncType;
            return this;
        }
        // Value of syncToken property of the last sync request response
        public String syncToken;
        public GetParameters syncToken(String syncToken) {
            this.syncToken = syncToken;
            return this;
        }
        // Number of records per page to be returned. The max number of records is 250, which is also the default. For FSync ??? if the number of records exceeds the parameter value (either specified or default), all of the pages can be retrieved in several requests. For ISync ??? if the number of records exceeds the page size, the number of incoming changes to this number is limited
        public Long perPage;
        public GetParameters perPage(Long perPage) {
            this.perPage = perPage;
            return this;
        }
        // Internal identifier of a page. It can be obtained from the 'nextPageId' parameter passed in response body
        public Long pageId;
        public GetParameters pageId(Long pageId) {
            this.pageId = pageId;
            return this;
        }
    }
}
