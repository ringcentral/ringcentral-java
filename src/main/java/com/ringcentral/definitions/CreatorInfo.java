package com.ringcentral.definitions;


public class CreatorInfo {
    /**
     * Internal identifier of a user who created a note/task
     */
    public String id;

    public CreatorInfo id(String id) {
        this.id = id;
        return this;
    }

}
