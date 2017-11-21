package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Contact extends Path {
    public Contact (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "contact", id);
    }
    public static class ListParameters
    {
        // If specified, only contacts whose First name or Last name start with the mentioned substring are returned. Case-insensitive
        public String startsWith;
        public ListParameters startsWith(String startsWith) {
            this.startsWith = startsWith;
            return this;
        }
        // Sorts results by the specified property. The default is 'First Name'
        public String[] sortBy;
        public ListParameters sortBy(String[] sortBy) {
            this.sortBy = sortBy;
            return this;
        }
        // Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'
        public Long page;
        public ListParameters page(Long page) {
            this.page = page;
            return this;
        }
        // Indicates the page size (number of items). If not specified, the value is '100' by default
        public Long perPage;
        public ListParameters perPage(Long perPage) {
            this.perPage = perPage;
            return this;
        }
        //
        public String[] phoneNumber;
        public ListParameters phoneNumber(String[] phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
    }
}
