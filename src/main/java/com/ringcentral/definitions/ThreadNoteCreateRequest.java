package com.ringcentral.definitions;

public class ThreadNoteCreateRequest {
    /** Internal identifier of a message thread Required */
    public String threadId;

    public ThreadNoteCreateRequest threadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /** Message or note text Required Example: Hello, how are you doing today? */
    public String text;

    public ThreadNoteCreateRequest text(String text) {
        this.text = text;
        return this;
    }
}
