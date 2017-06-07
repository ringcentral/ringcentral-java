package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.UserPermission;

public class AuthzProfile extends Path {
    public AuthzProfile(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "authz-profile", id);
    }

    public Check check() {
        return new Check(restClient, pathSegment, null);
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
