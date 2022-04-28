package com.ringcentral.definitions;


/**
 * Request body for operation createGlipFile
 */
public class CreateGlipFileRequest {
    /**
     * The file (binary or multipart/form-data) to upload
     * Required
     */
    public Attachment body;

    public CreateGlipFileRequest body(Attachment body) {
        this.body = body;
        return this;
    }
}
