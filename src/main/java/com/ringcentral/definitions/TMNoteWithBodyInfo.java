package com.ringcentral.definitions;


public class TMNoteWithBodyInfo
{
    /**
     * Internal identifier of a note
     */
    public String id;
    public TMNoteWithBodyInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Title of a note
     */
    public String title;
    public TMNoteWithBodyInfo title(String title)
    {
        this.title = title;
        return this;
    }

    /**
     * Internal identifiers of the chat(s) where the note is posted or shared.
     */
    public String[] chatIds;
    public TMNoteWithBodyInfo chatIds(String[] chatIds)
    {
        this.chatIds = chatIds;
        return this;
    }

    /**
     * Preview of a note (first 150 characters of a body)
     */
    public String preview;
    public TMNoteWithBodyInfo preview(String preview)
    {
        this.preview = preview;
        return this;
    }

    /**
     */
    public TMCreatorInfo creator;
    public TMNoteWithBodyInfo creator(TMCreatorInfo creator)
    {
        this.creator = creator;
        return this;
    }

    /**
     */
    public LastModifiedByInfo lastModifiedBy;
    public TMNoteWithBodyInfo lastModifiedBy(LastModifiedByInfo lastModifiedBy)
    {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     */
    public LockedByInfo lockedBy;
    public TMNoteWithBodyInfo lockedBy(LockedByInfo lockedBy)
    {
        this.lockedBy = lockedBy;
        return this;
    }

    /**
     * Note publishing status. Any note is created in &#039;Draft&#039; status. After it is posted it becomes &#039;Active&#039;
     * Enum: Active, Draft
     */
    public String status;
    public TMNoteWithBodyInfo status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Creation time
     * Format: date-time
     */
    public String creationTime;
    public TMNoteWithBodyInfo creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Datetime of the note last update
     * Format: date-time
     */
    public String lastModifiedTime;
    public TMNoteWithBodyInfo lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Enum: Note
     */
    public String type;
    public TMNoteWithBodyInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Text of a note
     */
    public String body;
    public TMNoteWithBodyInfo body(String body)
    {
        this.body = body;
        return this;
    }
}