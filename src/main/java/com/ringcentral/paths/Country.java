package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Country extends Path {
    public Country (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "country", id);
    }
    public static class ListParameters
    {
        // Specifies whether login with the phone numbers of this country is enabled or not
        public Boolean loginAllowed;
        public ListParameters loginAllowed(Boolean loginAllowed) {
            this.loginAllowed = loginAllowed;
            return this;
        }
        // Indicates whether signup/billing is allowed for a country. If not specified all countries are returned (according to other filters specified if any)
        public Boolean signupAllowed;
        public ListParameters signupAllowed(Boolean signupAllowed) {
            this.signupAllowed = signupAllowed;
            return this;
        }
        // Specifies if RingCentral sells phone numbers of this country
        public Boolean numberSelling;
        public ListParameters numberSelling(Boolean numberSelling) {
            this.numberSelling = numberSelling;
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
        // Specifies if free phone line for softphone is available for a country or not
        public Boolean freeSoftphoneLine;
        public ListParameters freeSoftphoneLine(Boolean freeSoftphoneLine) {
            this.freeSoftphoneLine = freeSoftphoneLine;
            return this;
        }
    }
}
