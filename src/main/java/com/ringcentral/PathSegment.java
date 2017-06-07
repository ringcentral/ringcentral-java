package com.ringcentral;

public class PathSegment {
    public PathSegment parent;

    public String segment;

    public String id;

    public PathSegment(PathSegment parent, String segment, String id) {
        this.parent = parent;
        this.segment = segment;
        this.id = id;
    }

    public String endpoint() {
        String path = "/";
        if (parent != null) {
            path = parent.endpoint() + "/";
        }
        path += segment;
        if (id != null) {
            path += "/" + id;
        }
        return path;
    }
}
