package com.ringcentral.paths;

import com.ringcentral.PathSegment;

public class Dictionary {
    private PathSegment pathSegment;

    public Dictionary(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "dictionary", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public Country country(String id) {
        return new Country(pathSegment, id);
    }

    public Country country() {
        return new Country(pathSegment, null);
    }

    public Language language(String id) {
        return new Language(pathSegment, id);
    }

    public Language language() {
        return new Language(pathSegment, null);
    }

    public Location location() {
        return new Location(pathSegment, null);
    }

    public State state(String id) {
        return new State(pathSegment, id);
    }

    public State state() {
        return new State(pathSegment, null);
    }

    public Timezone timezone(String id) {
        return new Timezone(pathSegment, id);
    }

    public Timezone timezone() {
        return new Timezone(pathSegment, null);
    }
}
