package com.ringcentral.definitions;


public class TMNoteInfo
{
    /**
     * Internal identifier of a note
     */
    public String id;
    public TMNoteInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Title of a note
     */
    public String title;
    public TMNoteInfo title(String title)
    {
        this.title = title;
        return this;
    }

    /**
     * Internal identifiers of the chat(s) where the note is posted or shared.
     */
    public String[] chatIds;
    public TMNoteInfo chatIds(String[] chatIds)
    {
        this.chatIds = chatIds;
        return this;
    }

    /**
     * Preview of a note (first 150 characters of a body)
     */
    public String preview;
    public TMNoteInfo preview(String preview)
    {
        this.preview = preview;
        return this;
    }

    /**
     */
    public TMCreatorInfo creator;
    public TMNoteInfo creator(TMCreatorInfo creator)
    {
        this.creator = creator;
        return this;
    }

    /**
     */
    public LastModifiedByInfo lastModifiedBy;
    public TMNoteInfo lastModifiedBy(LastModifiedByInfo lastModifiedBy)
    {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     */
    public LockedByInfo lockedBy;
    public TMNoteInfo lockedBy(LockedByInfo lockedBy)
    {
        this.lockedBy = lockedBy;
        return this;
    }

    /**
     * Note publishing status. Any note is created in &#039;Draft&#039; status. After it is posted it becomes &#039;Active&#039;
     * Enum: Active, Draft
     */
    public String status;
    public TMNoteInfo status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Creation time
     * Format: date-time
     */
    public String creationTime;
    public TMNoteInfo creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Datetime of the note last update
     * Format: date-time
     */
    public String lastModifiedTime;
    public TMNoteInfo lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Enum: Note
     */
    public String type;
    public TMNoteInfo type(String type)
    {
        this.type = type;
        return this;
    }
}