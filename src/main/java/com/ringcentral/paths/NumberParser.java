package com.ringcentral.paths;

import com.ringcentral.PathSegment;

public class NumberParser {
    private PathSegment pathSegment;

    public NumberParser(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "number-parser", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public Parse parse() {
        return new Parse(pathSegment, null);
    }
}
