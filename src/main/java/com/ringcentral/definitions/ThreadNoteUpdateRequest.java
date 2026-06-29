package com.ringcentral.definitions;

public class ThreadNoteUpdateRequest {
    /** Message or note text Required Example: Hello, how are you doing today? */
    public String text;

    public ThreadNoteUpdateRequest text(String text) {
        this.text = text;
        return this;
    }
}
