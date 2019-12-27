package com.ringcentral.definitions;


public class LockedByInfo {
    /**
     * Internal identifier of the user editing the note
     */
    public String id;

    public LockedByInfo id(String id) {
        this.id = id;
        return this;
    }

}
