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
        // only support 'userName' or 'email' filter expressions for now
        public String filter;
        public GetParameters filter(String filter) {
            this.filter = filter;
            return this;
        }
        // page size
        public Long count;
        public GetParameters count(Long count) {
            this.count = count;
            return this;
        }
        // start index (1-based)
        public Long startIndex;
        public GetParameters startIndex(Long startIndex) {
            this.startIndex = startIndex;
            return this;
        }
    }
}
