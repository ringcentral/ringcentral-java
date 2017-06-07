package com.ringcentral.paths;

import com.ringcentral.PathSegment;
import com.ringcentral.definitions.NavigationInfo;
import com.ringcentral.definitions.PagingInfo;
import com.ringcentral.definitions.TimezoneInfo;

public class Timezone {
    private PathSegment pathSegment;

    public Timezone(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "timezone", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public static class ListParameters {
        // Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'
        public String page;
        // Indicates the page size (number of items). If not specified, the value is '100' by default
        public String perPage;

        public ListParameters page(String page) {
            this.page = page;
            return this;
        }

        public ListParameters perPage(String perPage) {
            this.perPage = perPage;
            return this;
        }
    }

    public static class ListResponse {
        // List of timezones
        public TimezoneInfo[] records;
        // Information on navigation
        public NavigationInfo navigation;
        // Information on paging
        public PagingInfo paging;

        public ListResponse records(TimezoneInfo[] records) {
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
