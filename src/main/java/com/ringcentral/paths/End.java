package com.ringcentral.paths;

import com.ringcentral.PathSegment;

public class End {
    private PathSegment pathSegment;

    public End(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "end", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }
}
