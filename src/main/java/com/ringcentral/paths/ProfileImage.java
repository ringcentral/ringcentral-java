package com.ringcentral.paths;

import com.ringcentral.PathSegment;

public class ProfileImage {
    private PathSegment pathSegment;

    public ProfileImage(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "profile-image", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }
}
