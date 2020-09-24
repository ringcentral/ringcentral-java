package com.ringcentral.definitions;


public class GlipNoteCreate {
    /**
     * Title of a note. Max allowed legth is 250 characters
     * Required
     */
    public String title;
    /**
     * Contents of a note; HTML-markuped text. Max allowed length is 1048576 characters (1 Mb).
     */
    public String body;

    public GlipNoteCreate title(String title) {
        this.title = title;
        return this;
    }

    public GlipNoteCreate body(String body) {
        this.body = body;
        return this;
    }

}
