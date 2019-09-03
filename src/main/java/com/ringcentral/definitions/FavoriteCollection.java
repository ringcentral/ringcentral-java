package com.ringcentral.definitions;


public class FavoriteCollection {
    /**
     *
     */
    public FavoriteContactResource[] records;

    public FavoriteCollection records(FavoriteContactResource[] records) {
        this.records = records;
        return this;
    }

}
