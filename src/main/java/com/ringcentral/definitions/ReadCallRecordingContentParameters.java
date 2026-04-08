package com.ringcentral.definitions;

/** Query parameters for operation readCallRecordingContent */
public class ReadCallRecordingContentParameters {
    /**
     * Whether the content is expected to be displayed in the browser, or downloaded and saved
     * locally Enum: Inline, Attachment
     */
    public String contentDisposition;

    public ReadCallRecordingContentParameters contentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /** The default filename of the file to be downloaded */
    public String contentDispositionFilename;

    public ReadCallRecordingContentParameters contentDispositionFilename(
            String contentDispositionFilename) {
        this.contentDispositionFilename = contentDispositionFilename;
        return this;
    }
}
