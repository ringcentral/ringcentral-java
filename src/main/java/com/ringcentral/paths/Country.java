package com.ringcentral.paths;

import com.ringcentral.definitions.FullCountryInfo;
import com.ringcentral.definitions.NavigationInfo;
import com.ringcentral.definitions.PagingInfo;

public class Country {
    static
    public class ListParameters {
        // Specifies whether login with the phone numbers of this country is enabled or not
        public Boolean loginAllowed;
        // Specifies if RingCentral sells phone numbers of this country
        public Boolean numberSelling;
        // Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'
        public Long page;
        // Indicates the page size (number of items). If not specified, the value is '100' by default
        public Long perPage;

        public ListParameters loginAllowed(Boolean loginAllowed) {
            this.loginAllowed = loginAllowed;
            return this;
        }

        public ListParameters numberSelling(Boolean numberSelling) {
            this.numberSelling = numberSelling;
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

    static
    public class ListResponse {
        // List of countries with the country data
        public FullCountryInfo[] records;
        // Information on navigation
        public NavigationInfo navigation;
        // Information on paging
        public PagingInfo paging;

        public ListResponse records(FullCountryInfo[] records) {
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
