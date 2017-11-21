package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Files extends Path {
    public Files (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "files", id);
    }
    public static class PostParameters
    {
        // Internal identifier of a group the post with file attached will be added to
        public String groupId;
        public PostParameters groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        // Name of a file attached
        public String name;
        public PostParameters name(String name) {
            this.name = name;
            return this;
        }
    }
}
