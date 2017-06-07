package com.ringcentral.paths;

import com.ringcentral.PathSegment;

public class Revoke {
    private PathSegment pathSegment;

    public Revoke(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "revoke", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
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
