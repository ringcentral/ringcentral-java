package com.ringcentral.definitions;


    // Information on the task for multiple wireless points update
public class BulkTaskInfoWiUpdate
{
    /**
         * Internal identifier of a task for multiple switches creation
         */
        public String id;
  public BulkTaskInfoWiUpdate id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Status of a task
         * Enum: Accepted, Failed
         */
        public String status;
  public BulkTaskInfoWiUpdate status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * Task creation time
         */
        public String creationTime;
  public BulkTaskInfoWiUpdate creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         * Time of the task latest modification
         */
        public String lastModifiedTime;
  public BulkTaskInfoWiUpdate lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  
}
