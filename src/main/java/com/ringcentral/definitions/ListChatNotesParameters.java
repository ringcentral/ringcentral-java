package com.ringcentral.definitions;


public class ListChatNotesParameters
{
    /**
         * The end datetime for resulting records in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, e.g. 2019-03-10T18:23:45. The default value is Now.
         */
        public String creationTimeTo;
  public ListChatNotesParameters creationTimeTo(String creationTimeTo)
  {
    this.creationTimeTo = creationTimeTo;
    return this;
  }
  

        /**
         * The start datetime for resulting records in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone
         */
        public String creationTimeFrom;
  public ListChatNotesParameters creationTimeFrom(String creationTimeFrom)
  {
    this.creationTimeFrom = creationTimeFrom;
    return this;
  }
  

        /**
         * Internal identifier of the user that created the note. Multiple values are supported
         */
        public String creatorId;
  public ListChatNotesParameters creatorId(String creatorId)
  {
    this.creatorId = creatorId;
    return this;
  }
  

        /**
         * Status of notes to be fetched; if not specified all notes are fetched by default.
         * Enum: Active, Draft
         */
        public String status;
  public ListChatNotesParameters status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * Pagination token
         */
        public String pageToken;
  public ListChatNotesParameters pageToken(String pageToken)
  {
    this.pageToken = pageToken;
    return this;
  }
  

        /**
         * Max number of notes to be fetched by one request; the value range is 1-250.
         * Maximum: 250
         * Default: 30
         */
        public Long recordCount;
  public ListChatNotesParameters recordCount(Long recordCount)
  {
    this.recordCount = recordCount;
    return this;
  }
  
}
