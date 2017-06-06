package com.ringcentral.paths;

import com.ringcentral.RequestParameters;
import com.ringcentral.definitions.DialingPlanCountryInfo;
import com.ringcentral.definitions.NavigationInfo;
import com.ringcentral.definitions.PagingInfo;

public class DialingPlan {
    public static class ListParameters implements RequestParameters {
        // Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'
        public Long page;
        // Indicates the page size (number of items). If not specified, the value is '100' by default
        public Long perPage;

        public ListParameters page(Long page) {
            this.page = page;
            return this;
        }

        public ListParameters perPage(Long perPage) {
            this.perPage = perPage;
            return this;
        }
    }

    public static class ListResponse implements RequestParameters {
        // List of countries which can be selected for a dialing plan
        public DialingPlanCountryInfo[] records;
        // Information on paging
        public PagingInfo paging;
        // Information on navigation
        public NavigationInfo navigation;

        public ListResponse records(DialingPlanCountryInfo[] records) {
            this.records = records;
            return this;
        }

        public ListResponse paging(PagingInfo paging) {
            this.paging = paging;
            return this;
        }

        public ListResponse navigation(NavigationInfo navigation) {
            this.navigation = navigation;
            return this;
        }
    }
}
