package com.ringcentral.paths;

import com.ringcentral.PathSegment;

public class ClientInfo {
    private PathSegment pathSegment;

    public ClientInfo(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "client-info", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public CustomData customData(String id) {
        return new CustomData(pathSegment, id);
    }
}
