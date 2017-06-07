package com.ringcentral.paths;

import com.ringcentral.PathSegment;

public class MeetingServiceInfo {
    private PathSegment pathSegment;

    public MeetingServiceInfo(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "meeting/service-info", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }
}
