package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class ClientInfo extends Path {
    public ClientInfo (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "client-info", id);
    }
    public SipProvision sipProvision()
    {
        return new SipProvision(restClient, pathSegment, null);
    }
    public Banners banners()
    {
        return new Banners(restClient, pathSegment, null);
    }
    public CustomData customData(String id)
    {
        return new CustomData(restClient, pathSegment, id);
    }
    public SpecialNumberRule specialNumberRule()
    {
        return new SpecialNumberRule(restClient, pathSegment, null);
    }
}
