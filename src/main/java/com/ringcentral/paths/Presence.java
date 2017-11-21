package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Presence extends Path {
    public Presence (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "presence", id);
    }
    public Line line(String id)
    {
        return new Line(restClient, pathSegment, id);
    }
    public Line line()
    {
        return new Line(restClient, pathSegment, null);
    }
    public Permission permission(String id)
    {
        return new Permission(restClient, pathSegment, id);
    }
    public Permission permission()
    {
        return new Permission(restClient, pathSegment, null);
    }
}
