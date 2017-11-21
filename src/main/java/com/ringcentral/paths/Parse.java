package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Parse extends Path {
    public Parse (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "parse", id);
    }
    public static class PostParameters
    {
        // Internal identifier of a home country. The default value is ISO code (ISO 3166) of the user's home country or brand country, if the user is undefined
        public String homeCountry;
        public PostParameters homeCountry(String homeCountry) {
            this.homeCountry = homeCountry;
            return this;
        }
        // The default value is 'False'. If 'True', the numbers that are closer to the home country are given higher priority
        public Boolean nationalAsPriority;
        public PostParameters nationalAsPriority(Boolean nationalAsPriority) {
            this.nationalAsPriority = nationalAsPriority;
            return this;
        }
    }
}
