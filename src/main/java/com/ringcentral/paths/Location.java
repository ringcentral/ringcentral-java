package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Location extends Path {
    public Location (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "location", id);
    }
    public static class ListParameters
    {
        // Sorts results by the specified property. The default value is 'City'
        public String[] orderBy;
        public ListParameters orderBy(String[] orderBy) {
            this.orderBy = orderBy;
            return this;
        }
        // Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'.
        public Long page;
        public ListParameters page(Long page) {
            this.page = page;
            return this;
        }
        // Indicates the page size (number of items). If not specified, the value is '100' by default.
        public Long perPage;
        public ListParameters perPage(Long perPage) {
            this.perPage = perPage;
            return this;
        }
        // Internal identifier of a state
        public String stateId;
        public ListParameters stateId(String stateId) {
            this.stateId = stateId;
            return this;
        }
        // Specifies if nxx codes are returned
        public Boolean withNxx;
        public ListParameters withNxx(Boolean withNxx) {
            this.withNxx = withNxx;
            return this;
        }
    }
}
