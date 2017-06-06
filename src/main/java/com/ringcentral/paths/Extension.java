package com.ringcentral.paths;

import com.ringcentral.RequestParameters;
import com.ringcentral.definitions.ExtensionInfo;
import com.ringcentral.definitions.NavigationInfo;
import com.ringcentral.definitions.PagingInfo;

public class Extension {
    public static class ListParameters implements RequestParameters {
        // Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'
        public Long page;
        // Indicates the page size (number of items). If not specified, the value is '100' by default.
        public Long perPage;
        // Extension current state. Multiple values are supported. If 'Unassigned' is specified, then extensions without extensionNumber are returned. If not specified, then all extensions are returned
        public String status;
        // Extension type. Multiple values are supported
        public String type;

        public ListParameters page(Long page) {
            this.page = page;
            return this;
        }

        public ListParameters perPage(Long perPage) {
            this.perPage = perPage;
            return this;
        }

        public ListParameters status(String status) {
            this.status = status;
            return this;
        }

        public ListParameters type(String type) {
            this.type = type;
            return this;
        }
    }

    public static class ListResponse implements RequestParameters {
        // List of extensions with extension information
        public ExtensionInfo[] records;
        // Information on navigation
        public NavigationInfo navigation;
        // Information on paging
        public PagingInfo paging;

        public ListResponse records(ExtensionInfo[] records) {
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
