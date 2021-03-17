package com.ringcentral.definitions;


public class DataExportTask
{
    /**
         * Canonical URI of a task
         */
        public String uri;
  public DataExportTask uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Internal identifier of a task
         */
        public String id;
  public DataExportTask id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Task creation datetime
         */
        public String creationTime;
  public DataExportTask creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         * Task last modification datetime
         */
        public String lastModifiedTime;
  public DataExportTask lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  

        /**
         * Task status
         * Enum: Accepted, InProgress, Completed, Failed, Expired
         */
        public String status;
  public DataExportTask status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         */
        public CreatorInfo creator;
  public DataExportTask creator(CreatorInfo creator)
  {
    this.creator = creator;
    return this;
  }
  

        /**
         */
        public SpecificInfo specific;
  public DataExportTask specific(SpecificInfo specific)
  {
    this.specific = specific;
    return this;
  }
  

        /**
         * Data collection sets. Returned by task ID
         */
        public ExportTaskResultInfo[] datasets;
  public DataExportTask datasets(ExportTaskResultInfo[] datasets)
  {
    this.datasets = datasets;
    return this;
  }
  
}
