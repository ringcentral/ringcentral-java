package com.ringcentral.paths;

import com.ringcentral.HttpModel;
import com.ringcentral.definitions.NavigationInfo;
import com.ringcentral.definitions.PagingInfo;
import com.ringcentral.definitions.PersonalContactInfo;

public class Contact {
    public static class ListParameters implements HttpModel {
        // Phone number in E.164 (11-digits) format with or without plus '+'. Multiple values are supported
        public String phoneNumber;
        // If specified, only contacts whose First name or Last name start with the mentioned substring are returned. Case-insensitive
        public String startsWith;
        // Sorts results by the specified property. The default is 'First Name'
        public String sortBy;
        // Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'
        public Long page;
        // Indicates the page size (number of items). If not specified, the value is '100' by default
        public Long perPage;

        public ListParameters phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public ListParameters startsWith(String startsWith) {
            this.startsWith = startsWith;
            return this;
        }

        public ListParameters sortBy(String sortBy) {
            this.sortBy = sortBy;
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

    public static class ListResponse implements HttpModel {
        // List of personal contacts from the extension address book
        public PersonalContactInfo[] records;
        // Information on navigation
        public NavigationInfo navigation;
        // Information on paging
        public PagingInfo paging;

        public ListResponse records(PersonalContactInfo[] records) {
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
