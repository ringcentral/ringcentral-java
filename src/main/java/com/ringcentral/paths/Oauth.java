package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;

public class Oauth extends Path {
    public Oauth(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "oauth", id);
    }

    public Authorize authorize() {
        return new Authorize(restClient, pathSegment, null);
    }

    public Revoke revoke() {
        return new Revoke(restClient, pathSegment, null);
    }

    public Token token() {
        return new Token(restClient, pathSegment, null);
    }
}
