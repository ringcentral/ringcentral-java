package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Department extends Path {
    public Department (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "department", id);
    }
    public Members members()
    {
        return new Members(restClient, pathSegment, null);
    }
    public BulkAssign bulkAssign()
    {
        return new BulkAssign(restClient, pathSegment, null);
    }
}
