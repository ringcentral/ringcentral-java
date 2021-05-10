package com.ringcentral.definitions;


// Note creator information
public class GlipCreatorInfo {
    /**
     * Internal identifier of a user who created a note/task
     */
    public String id;

    public GlipCreatorInfo id(String id) {
        this.id = id;
        return this;
    }
}
