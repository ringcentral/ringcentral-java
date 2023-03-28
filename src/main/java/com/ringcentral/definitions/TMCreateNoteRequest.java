package com.ringcentral.definitions;


public class TMCreateNoteRequest {
    /**
     * Title of a note. Max allowed length is 250 characters
     * Required
     */
    public String title;
    /**
     * Contents of a note; HTML markup text. Max allowed length is 1048576 characters (1 Mb).
     */
    public String body;

    public TMCreateNoteRequest title(String title) {
        this.title = title;
        return this;
    }

    public TMCreateNoteRequest body(String body) {
        this.body = body;
        return this;
    }
}
