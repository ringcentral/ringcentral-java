package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class PagingOnlyGroups extends Path {
    public PagingOnlyGroups (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "paging-only-groups", id);
    }
    public Users users()
    {
        return new Users(restClient, pathSegment, null);
    }
    public Devices devices()
    {
        return new Devices(restClient, pathSegment, null);
    }
    public BulkAssign bulkAssign()
    {
        return new BulkAssign(restClient, pathSegment, null);
    }
}
