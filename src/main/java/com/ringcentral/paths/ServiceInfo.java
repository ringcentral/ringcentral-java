package com.ringcentral.paths;

import com.ringcentral.PathSegment;

public class ServiceInfo {
    private PathSegment pathSegment;

    public ServiceInfo(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "service-info", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }
}
