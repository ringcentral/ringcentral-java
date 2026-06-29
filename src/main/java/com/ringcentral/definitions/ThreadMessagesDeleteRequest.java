package com.ringcentral.definitions;

public class ThreadMessagesDeleteRequest {
    /** IDs of messages to be deleted Required Example: 2268298947,2268300303 */
    public String[] ids;

    public ThreadMessagesDeleteRequest ids(String[] ids) {
        this.ids = ids;
        return this;
    }
}
