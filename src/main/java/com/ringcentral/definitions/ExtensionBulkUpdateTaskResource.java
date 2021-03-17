package com.ringcentral.definitions;


    // Information on a task for updating multiple extensions
public class ExtensionBulkUpdateTaskResource
{
    /**
         * Link to a task resource
         * Required
         */
        public String uri;
  public ExtensionBulkUpdateTaskResource uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Internal identifier of a task
         * Required
         */
        public String id;
  public ExtensionBulkUpdateTaskResource id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Task status
         * Required
         * Enum: Accepted, InProgress, Completed, Failed
         */
        public String status;
  public ExtensionBulkUpdateTaskResource status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * Task creation datetime
         * Required
         */
        public String creationTime;
  public ExtensionBulkUpdateTaskResource creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         * Task latest update datetime
         * Required
         */
        public String lastModifiedTime;
  public ExtensionBulkUpdateTaskResource lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  

        /**
         */
        public ExtensionBulkUpdateTaskResult result;
  public ExtensionBulkUpdateTaskResource result(ExtensionBulkUpdateTaskResult result)
  {
    this.result = result;
    return this;
  }
  
}
