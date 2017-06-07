package com.ringcentral.paths;

import com.ringcentral.PathSegment;

public class Presence {
    private PathSegment pathSegment;

    public Presence(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "presence", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }
}
