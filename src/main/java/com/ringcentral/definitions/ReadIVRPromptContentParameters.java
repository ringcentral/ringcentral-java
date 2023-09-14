package com.ringcentral.definitions;


/**
 * Query parameters for operation readIVRPromptContent
 */
public class ReadIVRPromptContentParameters {
    /**
     * Whether the content is expected to be displayed in the browser, or downloaded and saved locally
     * Enum: Inline, Attachment
     */
    public String contentDisposition;
    /**
     * The default filename of the file to be downloaded
     */
    public String contentDispositionFilename;

    public ReadIVRPromptContentParameters contentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    public ReadIVRPromptContentParameters contentDispositionFilename(String contentDispositionFilename) {
        this.contentDispositionFilename = contentDispositionFilename;
        return this;
    }
}
