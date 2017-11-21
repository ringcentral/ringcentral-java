package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Users extends Path {
    public Users (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "Users", id);
    }
    public static class GetParameters
    {
        // User name or email
        public String[] filter;
        public GetParameters filter(String[] filter) {
            this.filter = filter;
            return this;
        }
        // Page
        public Long count;
        public GetParameters count(Long count) {
            this.count = count;
            return this;
        }
        // 1-based index of the query result
        public Long startIndex;
        public GetParameters startIndex(Long startIndex) {
            this.startIndex = startIndex;
            return this;
        }
    }
}
