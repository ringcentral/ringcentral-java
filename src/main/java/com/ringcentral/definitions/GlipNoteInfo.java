package com.ringcentral.definitions;


public class GlipNoteInfo
{
    /**
         * Internal identifier of a note
         */
        public String id;
  public GlipNoteInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Title of a note
         */
        public String title;
  public GlipNoteInfo title(String title)
  {
    this.title = title;
    return this;
  }
  

        /**
         * Internal identifiers of the chat(s) where the note is posted or shared.
         */
        public String[] chatIds;
  public GlipNoteInfo chatIds(String[] chatIds)
  {
    this.chatIds = chatIds;
    return this;
  }
  

        /**
         * Preview of a note (first 150 characters of a body)
         */
        public String preview;
  public GlipNoteInfo preview(String preview)
  {
    this.preview = preview;
    return this;
  }
  

        /**
         */
        public CreatorInfo creator;
  public GlipNoteInfo creator(CreatorInfo creator)
  {
    this.creator = creator;
    return this;
  }
  

        /**
         */
        public LastModifiedByInfo lastModifiedBy;
  public GlipNoteInfo lastModifiedBy(LastModifiedByInfo lastModifiedBy)
  {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }
  

        /**
         */
        public LockedByInfo lockedBy;
  public GlipNoteInfo lockedBy(LockedByInfo lockedBy)
  {
    this.lockedBy = lockedBy;
    return this;
  }
  

        /**
         * Note publishing status. Any note is created in 'Draft' status. After it is posted it becomes 'Active'
         * Enum: Active, Draft
         */
        public String status;
  public GlipNoteInfo status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * Creation time
         */
        public String creationTime;
  public GlipNoteInfo creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         * Datetime of the note last update
         */
        public String lastModifiedTime;
  public GlipNoteInfo lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  

        /**
         * Enum: Note
         */
        public String type;
  public GlipNoteInfo type(String type)
  {
    this.type = type;
    return this;
  }
  
}
