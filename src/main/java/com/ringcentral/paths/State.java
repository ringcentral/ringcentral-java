package com.ringcentral.paths;

import com.ringcentral.definitions.NavigationInfo;
import com.ringcentral.definitions.PagingInfo;
import com.ringcentral.definitions.StateInfo;

public class State {
    public static class ListParameters {
        // Internal identifier of a country
        public Long countryId;
        // Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'.
        public Long page;
        // Indicates the page size (number of items). If not specified, the value is '100' by default
        public Long perPage;
        // If 'True', the list of states with phone numbers available for buying is returned. The default value is 'False'
        public Boolean withPhoneNumbers;

        public ListParameters countryId(Long countryId) {
            this.countryId = countryId;
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

        public ListParameters withPhoneNumbers(Boolean withPhoneNumbers) {
            this.withPhoneNumbers = withPhoneNumbers;
            return this;
        }
    }

    public static class ListResponse {
        // List of states
        public StateInfo[] records;
        // Information on navigation
        public NavigationInfo navigation;
        // Information on paging
        public PagingInfo paging;

        public ListResponse records(StateInfo[] records) {
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
