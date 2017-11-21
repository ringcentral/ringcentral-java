package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Directory extends Path {
    public Directory (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "directory", id);
    }
    public Contacts contacts(String id)
    {
        return new Contacts(restClient, pathSegment, id);
    }
    public Contacts contacts()
    {
        return new Contacts(restClient, pathSegment, null);
    }
    public Federation federation()
    {
        return new Federation(restClient, pathSegment, null);
    }
    public FederationConflicts federationConflicts()
    {
        return new FederationConflicts(restClient, pathSegment, null);
    }
    public ExtensionNumbers extensionNumbers()
    {
        return new ExtensionNumbers(restClient, pathSegment, null);
    }
}
