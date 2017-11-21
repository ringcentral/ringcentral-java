package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class State extends Path {
    public State (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "state", id);
    }
    public static class ListParameters
    {
        // Internal identifier of a country
        public Long countryId;
        public ListParameters countryId(Long countryId) {
            this.countryId = countryId;
            return this;
        }
        // Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'.
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
        // If 'True', the list of states with phone numbers available for buying is returned. The default value is 'False'
        public Boolean withPhoneNumbers;
        public ListParameters withPhoneNumbers(Boolean withPhoneNumbers) {
            this.withPhoneNumbers = withPhoneNumbers;
            return this;
        }
    }
}
