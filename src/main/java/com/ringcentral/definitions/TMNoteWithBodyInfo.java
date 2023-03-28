package com.ringcentral.definitions;


public class TMNoteWithBodyInfo {
    /**
     * Internal identifier of a note
     */
    public String id;
    /**
     * Title of a note
     */
    public String title;
    /**
     * Internal identifiers of the chat(s) where the note is posted or shared.
     */
    public String[] chatIds;
    /**
     * Preview of a note (first 150 characters of a body)
     */
    public String preview;
    /**
     *
     */
    public TMCreatorInfo creator;
    /**
     *
     */
    public LastModifiedByInfo lastModifiedBy;
    /**
     *
     */
    public LockedByInfo lockedBy;
    /**
     * Note publishing status. Any note is created in &#039;Draft&#039; status. After it is posted it becomes &#039;Active&#039;
     * Enum: Active, Draft
     */
    public String status;
    /**
     * Creation time
     * Format: date-time
     */
    public String creationTime;
    /**
     * Datetime of the note last update
     * Format: date-time
     */
    public String lastModifiedTime;
    /**
     * Enum: Note
     */
    public String type;
    /**
     * Text of a note
     */
    public String body;

    public TMNoteWithBodyInfo id(String id) {
        this.id = id;
        return this;
    }

    public TMNoteWithBodyInfo title(String title) {
        this.title = title;
        return this;
    }

    public TMNoteWithBodyInfo chatIds(String[] chatIds) {
        this.chatIds = chatIds;
        return this;
    }

    public TMNoteWithBodyInfo preview(String preview) {
        this.preview = preview;
        return this;
    }

    public TMNoteWithBodyInfo creator(TMCreatorInfo creator) {
        this.creator = creator;
        return this;
    }

    public TMNoteWithBodyInfo lastModifiedBy(LastModifiedByInfo lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public TMNoteWithBodyInfo lockedBy(LockedByInfo lockedBy) {
        this.lockedBy = lockedBy;
        return this;
    }

    public TMNoteWithBodyInfo status(String status) {
        this.status = status;
        return this;
    }

    public TMNoteWithBodyInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public TMNoteWithBodyInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public TMNoteWithBodyInfo type(String type) {
        this.type = type;
        return this;
    }

    public TMNoteWithBodyInfo body(String body) {
        this.body = body;
        return this;
    }
}
