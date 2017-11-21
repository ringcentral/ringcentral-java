package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Contacts extends Path {
    public Contacts (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "contacts", id);
    }
    public static class ListParameters
    {
        // Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'
        public Long page;
        public ListParameters page(Long page) {
            this.page = page;
            return this;
        }
        // Indicates the page size (number of items). The possible values are: Max, all or a numeric value. If not specified, all records are returned on one page
        public Long perPage;
        public ListParameters perPage(Long perPage) {
            this.perPage = perPage;
            return this;
        }
        // If 'True' then only contacts of current account are returned, if 'False' then all contacts of all federation accounts are returned
        public Boolean excludeFederatedContacts;
        public ListParameters excludeFederatedContacts(Boolean excludeFederatedContacts) {
            this.excludeFederatedContacts = excludeFederatedContacts;
            return this;
        }
    }
}
