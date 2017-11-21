package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Glip extends Path {
    public Glip (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "glip", id);
    }
    public Companies companies(String id)
    {
        return new Companies(restClient, pathSegment, id);
    }
    public Groups groups(String id)
    {
        return new Groups(restClient, pathSegment, id);
    }
    public Groups groups()
    {
        return new Groups(restClient, pathSegment, null);
    }
    public Persons persons(String id)
    {
        return new Persons(restClient, pathSegment, id);
    }
    public Posts posts()
    {
        return new Posts(restClient, pathSegment, null);
    }
    public Files files(String id)
    {
        return new Files(restClient, pathSegment, id);
    }
    public Files files()
    {
        return new Files(restClient, pathSegment, null);
    }
    public Profile profile()
    {
        return new Profile(restClient, pathSegment, null);
    }
}
