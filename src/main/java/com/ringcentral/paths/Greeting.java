package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Greeting extends Path {
    public Greeting (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "greeting", id);
    }
    public static class ListParameters
    {
        // Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'
        public Long page;
        public ListParameters page(Long page) {
            this.page = page;
            return this;
        }
        // Indicates the page size (number of items). If not specified, the value is '100' by default
        public Long perPage;
        public ListParameters perPage(Long perPage) {
            this.perPage = perPage;
            return this;
        }
        // Type of a greeting, specifying the case when the greeting is played
        public String type;
        public ListParameters type(String type) {
            this.type = type;
            return this;
        }
        // Usage type of a greeting, specifying if the greeting is applied for user extension or department extension
        public String usageType;
        public ListParameters usageType(String usageType) {
            this.usageType = usageType;
            return this;
        }
    }
}
