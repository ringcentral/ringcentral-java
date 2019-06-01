package com.ringcentral.definitions;


public class FavoriteCollection {
    /**
     *
     */
    public String uri;
    /**
     *
     */
    public FavoriteContactResource[] records;

    public FavoriteCollection uri(String uri) {
        this.uri = uri;
        return this;
    }

    public FavoriteCollection records(FavoriteContactResource[] records) {
        this.records = records;
        return this;
    }

}
