package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Posts extends Path {
    public Posts (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "posts", id);
    }
    public static class ListParameters
    {
        // Identifier of a group to filter posts
        public String groupId;
        public ListParameters groupId(String groupId) {
            this.groupId = groupId;
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
