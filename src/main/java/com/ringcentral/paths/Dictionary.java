package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;

public class Dictionary extends Path {
    public Dictionary(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "dictionary", id);
    }

    public Country country(String id) {
        return new Country(restClient, pathSegment, id);
    }

    public Country country() {
        return new Country(restClient, pathSegment, null);
    }

    public Language language(String id) {
        return new Language(restClient, pathSegment, id);
    }

    public Language language() {
        return new Language(restClient, pathSegment, null);
    }

    public Location location() {
        return new Location(restClient, pathSegment, null);
    }

    public State state(String id) {
        return new State(restClient, pathSegment, id);
    }

    public State state() {
        return new State(restClient, pathSegment, null);
    }

    public Timezone timezone(String id) {
        return new Timezone(restClient, pathSegment, id);
    }

    public Timezone timezone() {
        return new Timezone(restClient, pathSegment, null);
    }
}
