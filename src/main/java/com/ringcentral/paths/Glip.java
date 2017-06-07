package com.ringcentral.paths;

import com.ringcentral.PathSegment;

public class Glip {
    private PathSegment pathSegment;

    public Glip(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "glip", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public Companies companies(String id) {
        return new Companies(pathSegment, id);
    }

    public Groups groups(String id) {
        return new Groups(pathSegment, id);
    }

    public Groups groups() {
        return new Groups(pathSegment, null);
    }

    public Persons persons(String id) {
        return new Persons(pathSegment, id);
    }

    public Posts posts() {
        return new Posts(pathSegment, null);
    }
}
