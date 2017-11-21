package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Conferencing extends Path {
    public Conferencing (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "conferencing", id);
    }
    public static class GetParameters
    {
        // Internal identifier of a country. If not specified, the response is returned for the brand country
        public String countryId;
        public GetParameters countryId(String countryId) {
            this.countryId = countryId;
            return this;
        }
    }
}
