package com.ringcentral.definitions;


/**
 * Query parameters for operation readMultichannelCallRecordingContent
 */
public class ReadMultichannelCallRecordingContentParameters {
    /**
     * Whether the content is expected to be displayed in the browser, or downloaded and saved locally
     * Enum: Inline, Attachment
     */
    public String contentDisposition;
    /**
     * The default filename of the file to be downloaded
     */
    public String contentDispositionFilename;

    public ReadMultichannelCallRecordingContentParameters contentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    public ReadMultichannelCallRecordingContentParameters contentDispositionFilename(String contentDispositionFilename) {
        this.contentDispositionFilename = contentDispositionFilename;
        return this;
    }
}
