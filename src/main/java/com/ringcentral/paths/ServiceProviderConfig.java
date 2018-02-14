package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class ServiceProviderConfig extends Path {
    public ServiceProviderConfig (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "ServiceProviderConfig", id);
    }
}
