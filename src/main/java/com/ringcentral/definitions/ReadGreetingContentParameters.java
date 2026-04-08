package com.ringcentral.definitions;

/** Query parameters for operation readGreetingContent */
public class ReadGreetingContentParameters {
    /**
     * Whether the content is expected to be displayed in the browser, or downloaded and saved
     * locally Enum: Inline, Attachment
     */
    public String contentDisposition;

    public ReadGreetingContentParameters contentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /** The default filename of the file to be downloaded */
    public String contentDispositionFilename;

    public ReadGreetingContentParameters contentDispositionFilename(
            String contentDispositionFilename) {
        this.contentDispositionFilename = contentDispositionFilename;
        return this;
    }
}
