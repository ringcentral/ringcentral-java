package com.ringcentral.paths;

import com.ringcentral.PathSegment;

public class NumberPool {
    private PathSegment pathSegment;

    public NumberPool(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "number-pool", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public Lookup lookup() {
        return new Lookup(pathSegment, null);
    }

    public Reserve reserve() {
        return new Reserve(pathSegment, null);
    }
}
