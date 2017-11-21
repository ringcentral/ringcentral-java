package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Meeting extends Path {
    public Meeting (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "meeting", id);
    }
    public End end()
    {
        return new End(restClient, pathSegment, null);
    }
}
