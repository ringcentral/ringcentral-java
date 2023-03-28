package com.ringcentral.definitions;


public class TMNoteInfo {
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

    public TMNoteInfo id(String id) {
        this.id = id;
        return this;
    }

    public TMNoteInfo title(String title) {
        this.title = title;
        return this;
    }

    public TMNoteInfo chatIds(String[] chatIds) {
        this.chatIds = chatIds;
        return this;
    }

    public TMNoteInfo preview(String preview) {
        this.preview = preview;
        return this;
    }

    public TMNoteInfo creator(TMCreatorInfo creator) {
        this.creator = creator;
        return this;
    }

    public TMNoteInfo lastModifiedBy(LastModifiedByInfo lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public TMNoteInfo lockedBy(LockedByInfo lockedBy) {
        this.lockedBy = lockedBy;
        return this;
    }

    public TMNoteInfo status(String status) {
        this.status = status;
        return this;
    }

    public TMNoteInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public TMNoteInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public TMNoteInfo type(String type) {
        this.type = type;
        return this;
    }
}
