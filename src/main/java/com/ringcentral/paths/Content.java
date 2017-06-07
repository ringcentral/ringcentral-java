package com.ringcentral.paths;

import com.ringcentral.PathSegment;

public class Content {
    private PathSegment pathSegment;

    public Content(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "content", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }
}
