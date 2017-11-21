package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Credentials extends Path {
    public Credentials (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "credentials", id);
    }
    public Validate validate()
    {
        return new Validate(restClient, pathSegment, null);
    }
    public Verify verify()
    {
        return new Verify(restClient, pathSegment, null);
    }
}
