package com.ringcentral.definitions;


public class CallQueueMemberInfo {
    /**
     * Link to a call queue member
     */
    public String uri;
    /**
     * Internal identifier of a call queue member
     */
    public String id;
    /**
     * Extension number of a call queue member
     */
    public String extensionNumber;

    public CallQueueMemberInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallQueueMemberInfo id(String id) {
        this.id = id;
        return this;
    }

    public CallQueueMemberInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

}
