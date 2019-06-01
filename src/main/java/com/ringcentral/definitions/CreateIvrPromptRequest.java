package com.ringcentral.definitions;


public class CreateIvrPromptRequest {
    /**
     * Audio file that will be used as a prompt. Attachment cannot be empty, only audio files are supported
     */
    public Attachment attachment;
    /**
     * Description of file contents.
     */
    public String name;

    public CreateIvrPromptRequest attachment(Attachment attachment) {
        this.attachment = attachment;
        return this;
    }

    public CreateIvrPromptRequest name(String name) {
        this.name = name;
        return this;
    }

}
