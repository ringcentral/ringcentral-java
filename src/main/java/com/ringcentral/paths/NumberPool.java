package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;

public class NumberPool extends Path {
    public NumberPool(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "number-pool", id);
    }

    public Lookup lookup() {
        return new Lookup(restClient, pathSegment, null);
    }

    public Reserve reserve() {
        return new Reserve(restClient, pathSegment, null);
    }
}
