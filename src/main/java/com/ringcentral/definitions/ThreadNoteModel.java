package com.ringcentral.definitions;

public class ThreadNoteModel {
    /** Internal identifier of a note Required */
    public String id;

    public ThreadNoteModel id(String id) {
        this.id = id;
        return this;
    }

    /** Internal identifier of a message thread Required */
    public String threadId;

    public ThreadNoteModel threadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /** Thread/message availability Required Enum: Alive, Deleted */
    public String availability;

    public ThreadNoteModel availability(String availability) {
        this.availability = availability;
        return this;
    }

    /** Note creation date/time Required Format: date-time */
    public String creationTime;

    public ThreadNoteModel creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /** Message last modification date/time Required Format: date-time */
    public String lastModifiedTime;

    public ThreadNoteModel lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /** Message or note text Example: Hello, how are you doing today? */
    public String text;

    public ThreadNoteModel text(String text) {
        this.text = text;
        return this;
    }

    /** Thread note author */
    public ThreadNoteModelAuthor author;

    public ThreadNoteModel author(ThreadNoteModelAuthor author) {
        this.author = author;
        return this;
    }
}
