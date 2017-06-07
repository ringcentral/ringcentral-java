package com.ringcentral.paths;

import com.ringcentral.PathSegment;

public class Restapi {
    private PathSegment pathSegment;

    public Restapi(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "restapi", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public Oauth oauth() {
        return new Oauth(pathSegment, null);
    }

    public Account account(String id) {
        return new Account(pathSegment, id);
    }

    public Account account() {
        return new Account(pathSegment, "~");
    }

    public ClientInfo clientInfo() {
        return new ClientInfo(pathSegment, null);
    }

    public Dictionary dictionary() {
        return new Dictionary(pathSegment, null);
    }

    public Glip glip() {
        return new Glip(pathSegment, null);
    }

    public NumberParser numberParser() {
        return new NumberParser(pathSegment, null);
    }

    public NumberPool numberPool() {
        return new NumberPool(pathSegment, null);
    }

    public Subscription subscription(String id) {
        return new Subscription(pathSegment, id);
    }

    public Subscription subscription() {
        return new Subscription(pathSegment, null);
    }
}
