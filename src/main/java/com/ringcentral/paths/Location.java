package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.LocationInfo;
import com.ringcentral.definitions.NavigationInfo;
import com.ringcentral.definitions.PagingInfo;

public class Location extends Path {
    public Location(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "location", id);
    }

    public static class ListParameters {
        // Sorts results by the specified property. The default value is 'City'
        public String orderBy;
        // Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'.
        public Long page;
        // Indicates the page size (number of items). If not specified, the value is '100' by default.
        public Long perPage;
        // Internal identifier of a state
        public String stateId;
        // Specifies if nxx codes are returned
        public Boolean withNxx;

        public ListParameters orderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public ListParameters page(Long page) {
            this.page = page;
            return this;
        }

        public ListParameters perPage(Long perPage) {
            this.perPage = perPage;
            return this;
        }

        public ListParameters stateId(String stateId) {
            this.stateId = stateId;
            return this;
        }

        public ListParameters withNxx(Boolean withNxx) {
            this.withNxx = withNxx;
            return this;
        }
    }

    public static class ListResponse {
        // List of locations
        public LocationInfo[] records;
        // Information on navigation
        public NavigationInfo navigation;
        // Information on paging
        public PagingInfo paging;

        public ListResponse records(LocationInfo[] records) {
            this.records = records;
            return this;
        }

        public ListResponse navigation(NavigationInfo navigation) {
            this.navigation = navigation;
            return this;
        }

        public ListResponse paging(PagingInfo paging) {
            this.paging = paging;
            return this;
        }
    }
}
