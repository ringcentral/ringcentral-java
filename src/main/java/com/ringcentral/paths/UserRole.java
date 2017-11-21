package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class UserRole extends Path {
    public UserRole (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "user-role", id);
    }
    public Default _default()
    {
        return new Default(restClient, pathSegment, null);
    }
}
