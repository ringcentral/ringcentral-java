package com.ringcentral.definitions;


public class UpdateIVRPromptRequest {
    /**
     * Name of a file to be uploaded as a prompt.
     */
    public String filename;

    public UpdateIVRPromptRequest filename(String filename) {
        this.filename = filename;
        return this;
    }

}
