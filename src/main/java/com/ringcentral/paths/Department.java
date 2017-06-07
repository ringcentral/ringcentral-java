package com.ringcentral.paths;

import com.ringcentral.PathSegment;

public class Department {
    private PathSegment pathSegment;

    public Department(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "department", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public Members members() {
        return new Members(pathSegment, null);
    }
}
