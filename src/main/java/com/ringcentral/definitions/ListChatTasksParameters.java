package com.ringcentral.definitions;


public class ListChatTasksParameters
{
    /**
         * The end datetime for resulting records in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, e.g. 2019-03-10T18:23:45Z
         * Default: now
         */
        public String creationTimeTo;
  public ListChatTasksParameters creationTimeTo(String creationTimeTo)
  {
    this.creationTimeTo = creationTimeTo;
    return this;
  }
  

        /**
         * The start datetime for resulting records in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, e.g. 2016-02-23T00:00:00
         */
        public String creationTimeFrom;
  public ListChatTasksParameters creationTimeFrom(String creationTimeFrom)
  {
    this.creationTimeFrom = creationTimeFrom;
    return this;
  }
  

        /**
         * Internal identifier of a task creator
         */
        public String[] creatorId;
  public ListChatTasksParameters creatorId(String[] creatorId)
  {
    this.creatorId = creatorId;
    return this;
  }
  

        /**
         * Task execution status
         */
        public String[] status;
  public ListChatTasksParameters status(String[] status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * Task assignment status
         * Enum: Unassigned, Assigned
         */
        public String assignmentStatus;
  public ListChatTasksParameters assignmentStatus(String assignmentStatus)
  {
    this.assignmentStatus = assignmentStatus;
    return this;
  }
  

        /**
         * Internal identifier of a task assignee
         */
        public String[] assigneeId;
  public ListChatTasksParameters assigneeId(String[] assigneeId)
  {
    this.assigneeId = assigneeId;
    return this;
  }
  

        /**
         * Task execution status by assignee(-s) specified in assigneeId
         * Enum: Pending, Completed
         */
        public String assigneeStatus;
  public ListChatTasksParameters assigneeStatus(String assigneeStatus)
  {
    this.assigneeStatus = assigneeStatus;
    return this;
  }
  

        /**
         * Token of the current page. If token is omitted then the first page should be returned
         */
        public String pageToken;
  public ListChatTasksParameters pageToken(String pageToken)
  {
    this.pageToken = pageToken;
    return this;
  }
  

        /**
         * Number of records to be returned per screen
         * Maximum: 250
         * Minimum: 1
         * Default: 30
         */
        public Long recordCount;
  public ListChatTasksParameters recordCount(Long recordCount)
  {
    this.recordCount = recordCount;
    return this;
  }
  
}
