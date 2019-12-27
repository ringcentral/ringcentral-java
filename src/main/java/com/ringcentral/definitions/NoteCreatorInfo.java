package com.ringcentral.definitions;


public class NoteCreatorInfo {
    /**
     * Internal identifier of the user who created the note
     */
    public String id;

    public NoteCreatorInfo id(String id) {
        this.id = id;
        return this;
    }

}
