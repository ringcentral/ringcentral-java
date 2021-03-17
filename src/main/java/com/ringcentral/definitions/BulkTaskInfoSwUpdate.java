package com.ringcentral.definitions;


    // Information on the task for multiple switches update
public class BulkTaskInfoSwUpdate
{
    /**
         * Internal identifier of a task for multiple switches creation
         */
        public String id;
  public BulkTaskInfoSwUpdate id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Status of a task
         * Enum: Accepted, Failed
         */
        public String status;
  public BulkTaskInfoSwUpdate status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * Task creation time
         */
        public String creationTime;
  public BulkTaskInfoSwUpdate creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         * Time of the task latest modification
         */
        public String lastModifiedTime;
  public BulkTaskInfoSwUpdate lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  
}
