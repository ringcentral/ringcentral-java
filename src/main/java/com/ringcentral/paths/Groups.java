package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Groups extends Path {
    public Groups (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "groups", id);
    }
    public BulkAssign bulkAssign()
    {
        return new BulkAssign(restClient, pathSegment, null);
    }
    public Posts posts()
    {
        return new Posts(restClient, pathSegment, null);
    }
    public static class ListParameters
    {
        // Type of a group. 'PrivateChat' is a group of 2 members. 'Group' is a chat of 2 and more participants, the membership cannot be changed after group creation. 'Team' is a chat of 1 and more participants, the membership can be modified in future
        public String[] type;
        public ListParameters type(String[] type) {
            this.type = type;
            return this;
        }
        // Token of a page to be returned, see Glip Navigation Info
        public String pageToken;
        public ListParameters pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }
        // Max numbers of records to be returned. The default/maximum value is 250
        public Long recordCount;
        public ListParameters recordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }
    }
}
