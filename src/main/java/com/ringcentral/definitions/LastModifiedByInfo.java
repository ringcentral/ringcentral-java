package com.ringcentral.definitions;


public class LastModifiedByInfo {
    /**
     * Internal identifier of the user who last updated the note
     */
    public String id;

    public LastModifiedByInfo id(String id) {
        this.id = id;
        return this;
    }

}
