package com.ringcentral.definitions;


public class CallQueueMemberInfo {
    /**
     * Link to a call queue member
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of a call queue member
     * Format: int64
     */
    public Long id;
    /**
     * Extension number of a call queue member
     */
    public String extensionNumber;

    public CallQueueMemberInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallQueueMemberInfo id(Long id) {
        this.id = id;
        return this;
    }

    public CallQueueMemberInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
