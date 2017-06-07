package com.ringcentral.paths;

import com.ringcentral.PathSegment;
import com.ringcentral.definitions.UserPermission;

public class AuthzProfile {
    private PathSegment pathSegment;

    public AuthzProfile(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "authz-profile", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public Check check() {
        return new Check(pathSegment, null);
    }

    public static class GetResponse {
        // Canonical URI of an authorization profile resource
        public String uri;
        // List of user permissions granted
        public UserPermission[] permissions;

        public GetResponse uri(String uri) {
            this.uri = uri;
            return this;
        }

        public GetResponse permissions(UserPermission[] permissions) {
            this.permissions = permissions;
            return this;
        }
    }
}
