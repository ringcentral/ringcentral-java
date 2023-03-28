package com.ringcentral.definitions;


/**
 * The rejected recipient details
 */
public class RejectedRecipientResponseResource {
    /**
     * The index of the messages list in the send batch request where the invalid recipient was found
     * Format: int64
     * Example: 1
     */
    public Long index;
    /**
     * The invalid recipient number as found in the request
     * Example: 29395
     */
    public String[] to;
    /**
     * The error code
     * Example: CMN-100
     */
    public String errorCode;
    /**
     * The description of the error
     * Example: The recipient is invalid
     */
    public String description;

    public RejectedRecipientResponseResource index(Long index) {
        this.index = index;
        return this;
    }

    public RejectedRecipientResponseResource to(String[] to) {
        this.to = to;
        return this;
    }

    public RejectedRecipientResponseResource errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public RejectedRecipientResponseResource description(String description) {
        this.description = description;
        return this;
    }
}
