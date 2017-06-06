package com.ringcentral.paths;

import com.ringcentral.RequestParameters;
import com.ringcentral.definitions.ForwardingNumberInfo;
import com.ringcentral.definitions.NavigationInfo;
import com.ringcentral.definitions.PagingInfo;

public class ForwardingNumber {
    public static class PostParameters implements RequestParameters {
        // Forwarding/Call flip phone number
        public String phoneNumber;
        // Forwarding/Call flip number title
        public String label;

        public PostParameters phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public PostParameters label(String label) {
            this.label = label;
            return this;
        }
    }

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
        // List of forwarding phone numbers
        public ForwardingNumberInfo[] records;
        // Information on navigation
        public NavigationInfo navigation;
        // Information on paging
        public PagingInfo paging;

        public ListResponse records(ForwardingNumberInfo[] records) {
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
