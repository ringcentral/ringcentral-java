package com.ringcentral.definitions;


/**
 * Information about the message that failed to be sent
 */
public class RejectedMessageInfo {
    /**
     * Index of the rejected message in the request
     * Format: int32
     * Example: 2
     */
    public Long index;
    /**
     *
     */
    public String[] to;
    /**
     * Standard error code
     * Example: CMN-100
     */
    public String errorCode;
    /**
     * Standard error description
     * Example: Parameter [to] value is invalid
     */
    public String description;

    public RejectedMessageInfo index(Long index) {
        this.index = index;
        return this;
    }

    public RejectedMessageInfo to(String[] to) {
        this.to = to;
        return this;
    }

    public RejectedMessageInfo errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public RejectedMessageInfo description(String description) {
        this.description = description;
        return this;
    }
}
