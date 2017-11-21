package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Timezone extends Path {
    public Timezone (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "timezone", id);
    }
    public static class ListParameters
    {
        // Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'
        public String page;
        public ListParameters page(String page) {
            this.page = page;
            return this;
        }
        // Indicates the page size (number of items). If not specified, the value is '100' by default
        public String perPage;
        public ListParameters perPage(String perPage) {
            this.perPage = perPage;
            return this;
        }
    }
    public static class GetParameters
    {
        // Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'
        public Long page;
        public GetParameters page(Long page) {
            this.page = page;
            return this;
        }
        // Indicates the page size (number of items). If not specified, the value is '100' by default
        public Long perPage;
        public GetParameters perPage(Long perPage) {
            this.perPage = perPage;
            return this;
        }
    }
}
