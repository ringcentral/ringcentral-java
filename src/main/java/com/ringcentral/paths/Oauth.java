package com.ringcentral.paths;

import com.ringcentral.PathSegment;

public class Oauth {
    private PathSegment pathSegment;

    public Oauth(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "oauth", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public Authorize authorize() {
        return new Authorize(pathSegment, null);
    }

    public Revoke revoke() {
        return new Revoke(pathSegment, null);
    }

    public Token token() {
        return new Token(pathSegment, null);
    }
}
