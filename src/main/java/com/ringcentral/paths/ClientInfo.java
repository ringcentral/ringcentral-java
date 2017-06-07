package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;

public class ClientInfo extends Path {
    public ClientInfo(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "client-info", id);
    }

    public CustomData customData(String id) {
        return new CustomData(restClient, pathSegment, id);
    }
}
