package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;

public class Glip extends Path {
    public Glip(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "glip", id);
    }

    public Companies companies(String id) {
        return new Companies(restClient, pathSegment, id);
    }

    public Groups groups(String id) {
        return new Groups(restClient, pathSegment, id);
    }

    public Groups groups() {
        return new Groups(restClient, pathSegment, null);
    }

    public Persons persons(String id) {
        return new Persons(restClient, pathSegment, id);
    }

    public Posts posts() {
        return new Posts(restClient, pathSegment, null);
    }
}
