package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Reporting extends Path {
    public Reporting (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "reporting", id);
    }
    public Settings settings()
    {
        return new Settings(restClient, pathSegment, null);
    }
}
