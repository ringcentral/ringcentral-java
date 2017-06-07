package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;

public class Revoke extends Path {
    public Revoke(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "revoke", id);
    }

    public static class PostParameters {
        // Active access or refresh token to be revoked
        public String token;

        public PostParameters token(String token) {
            this.token = token;
            return this;
        }
    }
}
