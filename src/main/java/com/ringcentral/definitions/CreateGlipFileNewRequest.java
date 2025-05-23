package com.ringcentral.definitions;


/**
 * Request body for operation createGlipFileNew
 */
public class CreateGlipFileNewRequest {
    /**
     * File(s) - binary or multipart/form-data - to upload
     * Required
     */
    public Attachment body;

    public CreateGlipFileNewRequest body(Attachment body) {
        this.body = body;
        return this;
    }
}
