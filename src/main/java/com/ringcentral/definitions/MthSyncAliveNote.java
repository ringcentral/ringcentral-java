package com.ringcentral.definitions;

public class MthSyncAliveNote {
    /** Required Enum: AliveNote */
    public String recordType;

    public MthSyncAliveNote recordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /** Internal identifier of a note Required */
    public String id;

    public MthSyncAliveNote id(String id) {
        this.id = id;
        return this;
    }

    /** Internal identifier of a message thread Required */
    public String threadId;

    public MthSyncAliveNote threadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /** Thread/message availability Required Enum: Alive, Deleted */
    public String availability;

    public MthSyncAliveNote availability(String availability) {
        this.availability = availability;
        return this;
    }

    /** Note creation date/time Required Format: date-time */
    public String creationTime;

    public MthSyncAliveNote creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /** Message last modification date/time Required Format: date-time */
    public String lastModifiedTime;

    public MthSyncAliveNote lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /** Message or note text Example: Hello, how are you doing today? */
    public String text;

    public MthSyncAliveNote text(String text) {
        this.text = text;
        return this;
    }

    /** Thread note author */
    public MthSyncAliveNoteAuthor author;

    public MthSyncAliveNote author(MthSyncAliveNoteAuthor author) {
        this.author = author;
        return this;
    }
}
