package com.ringcentral.definitions;


public class FavoriteContactList {
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public FavoriteContactResource[] records;

    public FavoriteContactList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public FavoriteContactList records(FavoriteContactResource[] records) {
        this.records = records;
        return this;
    }
}
