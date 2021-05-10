package com.ringcentral.definitions;


// Request body for operation createIVRPrompt
public class CreateIVRPromptRequest {
    /**
     * Audio file that will be used as a prompt. Attachment cannot be empty, only audio files are supported
     * Required
     */
    public Attachment attachment;
    /**
     * Description of file contents.
     */
    public String name;

    public CreateIVRPromptRequest attachment(Attachment attachment) {
        this.attachment = attachment;
        return this;
    }

    public CreateIVRPromptRequest name(String name) {
        this.name = name;
        return this;
    }
}
