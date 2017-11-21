package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Licenses extends Path {
    public Licenses (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "licenses", id);
    }
    public BulkPurchase bulkPurchase()
    {
        return new BulkPurchase(restClient, pathSegment, null);
    }
    public static class ListParameters
    {
        // Indicates the page number to retrieve. Only positive number values are allowed. The default value is '1'
        public Long page;
        public ListParameters page(Long page) {
            this.page = page;
            return this;
        }
        // Indicates the page size (number of items). If not specified, the value is '25' by default
        public Long perPage;
        public ListParameters perPage(Long perPage) {
            this.perPage = perPage;
            return this;
        }
        // Internal identifier of a license type. If not specified account licenses of all types are returned
        public Long typeId;
        public ListParameters typeId(Long typeId) {
            this.typeId = typeId;
            return this;
        }
    }
}
