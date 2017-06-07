package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;

public class NumberParser extends Path {
    public NumberParser(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "number-parser", id);
    }

    public Parse parse() {
        return new Parse(restClient, pathSegment, null);
    }
}
