package com.ringcentral.definitions;


/**
 * Query parameters for operation readMessageContent
 */
public class ReadMessageContentParameters {
    /**
     * Content disposition of a response
     * Default: Inline
     * Enum: Inline, Attachment
     */
    public String contentDisposition;

    public ReadMessageContentParameters contentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }
}
