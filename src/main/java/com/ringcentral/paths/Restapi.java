package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;

public class Restapi extends Path {
    public Restapi(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "restapi", id);
    }

    public Oauth oauth() {
        return new Oauth(restClient, pathSegment, null);
    }

    public Account account(String id) {
        return new Account(restClient, pathSegment, id);
    }

    public Account account() {
        return new Account(restClient, pathSegment, "~");
    }

    public ClientInfo clientInfo() {
        return new ClientInfo(restClient, pathSegment, null);
    }

    public Dictionary dictionary() {
        return new Dictionary(restClient, pathSegment, null);
    }

    public Glip glip() {
        return new Glip(restClient, pathSegment, null);
    }

    public NumberParser numberParser() {
        return new NumberParser(restClient, pathSegment, null);
    }

    public NumberPool numberPool() {
        return new NumberPool(restClient, pathSegment, null);
    }

    public Subscription subscription(String id) {
        return new Subscription(restClient, pathSegment, id);
    }

    public Subscription subscription() {
        return new Subscription(restClient, pathSegment, null);
    }
}
