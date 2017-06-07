package com.ringcentral.paths;

import com.ringcentral.PathSegment;
import com.ringcentral.definitions.CallLogRecord;
import com.ringcentral.definitions.NavigationInfo;
import com.ringcentral.definitions.PagingInfo;

public class ActiveCalls {
    private PathSegment pathSegment;

    public ActiveCalls(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "active-calls", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public static class ListParameters {
        // The direction for the result records. It is allowed to specify more than one direction. If not specified, both inbound and outbound records are returned. Multiple values are accepted
        public String direction;
        // Call type of a record. It is allowed to specify more than one type. If not specified, all call types are returned. Multiple values are accepted
        public String type;
        // Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'.
        public Long page;
        // Indicates the page size (number of items). If not specified, the value is '100' by default.
        public Long perPage;

        public ListParameters direction(String direction) {
            this.direction = direction;
            return this;
        }

        public ListParameters type(String type) {
            this.type = type;
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
    }

    public static class ListResponse {
        // List of call log records
        public CallLogRecord[] records;
        // Information on navigation
        public NavigationInfo navigation;
        // Information on paging
        public PagingInfo paging;

        public ListResponse records(CallLogRecord[] records) {
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
