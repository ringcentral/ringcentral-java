package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Profile extends Path {
    public Profile (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "profile", id);
    }
    public static class GetParameters
    {
        // List of attributes to be returned. To return unread message count 'unreadPostsCount' and 'tooManyUnreadPosts' should be specified
        public String fields;
        public GetParameters fields(String fields) {
            this.fields = fields;
            return this;
        }
    }
}
