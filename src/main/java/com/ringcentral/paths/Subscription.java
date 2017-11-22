package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Subscription extends Path {
    public Subscription (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "subscription", id);
    }
    public Renew renew()
    {
        return new Renew(restClient, pathSegment, null);
    }
    public static class PutParameters
    {
        // If 'True' then aggregated presence status is returned in a notification payload
        public Boolean aggregated;
        public PutParameters aggregated(Boolean aggregated) {
            this.aggregated = aggregated;
            return this;
        }
    }
}
