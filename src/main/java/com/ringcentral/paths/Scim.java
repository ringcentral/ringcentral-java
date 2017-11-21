package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Scim extends Path {
    public Scim (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "scim", id);
    }
    public Users users(String id)
    {
        return new Users(restClient, pathSegment, id);
    }
    public Users users()
    {
        return new Users(restClient, pathSegment, null);
    }
}
