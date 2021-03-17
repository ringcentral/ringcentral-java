package com.ringcentral.definitions;


public class GetGlipNoteInfo
{
    /**
         * Internal identifier of a note
         */
        public String id;
  public GetGlipNoteInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Title of a note
         */
        public String title;
  public GetGlipNoteInfo title(String title)
  {
    this.title = title;
    return this;
  }
  

        /**
         * Internal identifiers of the chat(s) where the note is posted or shared.
         */
        public String[] chatIds;
  public GetGlipNoteInfo chatIds(String[] chatIds)
  {
    this.chatIds = chatIds;
    return this;
  }
  

        /**
         * Preview of a note (first 150 characters of a body)
         */
        public String preview;
  public GetGlipNoteInfo preview(String preview)
  {
    this.preview = preview;
    return this;
  }
  

        /**
         * Text of a note
         */
        public String body;
  public GetGlipNoteInfo body(String body)
  {
    this.body = body;
    return this;
  }
  

        /**
         */
        public CreatorInfo creator;
  public GetGlipNoteInfo creator(CreatorInfo creator)
  {
    this.creator = creator;
    return this;
  }
  

        /**
         */
        public LastModifiedByInfo lastModifiedBy;
  public GetGlipNoteInfo lastModifiedBy(LastModifiedByInfo lastModifiedBy)
  {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }
  

        /**
         */
        public LockedByInfo lockedBy;
  public GetGlipNoteInfo lockedBy(LockedByInfo lockedBy)
  {
    this.lockedBy = lockedBy;
    return this;
  }
  

        /**
         * Note publishing status. Any note is created in 'Draft' status. After it is posted it becomes 'Active'
         * Enum: Active, Draft
         */
        public String status;
  public GetGlipNoteInfo status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * Creation time
         */
        public String creationTime;
  public GetGlipNoteInfo creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         * Datetime of the note last update
         */
        public String lastModifiedTime;
  public GetGlipNoteInfo lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  

        /**
         * Enum: Note
         */
        public String type;
  public GetGlipNoteInfo type(String type)
  {
    this.type = type;
    return this;
  }
  
}
