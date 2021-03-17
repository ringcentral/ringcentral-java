package com.ringcentral.definitions;


public class ListDataExportTasksParameters
{
    /**
         * Status of the task(s) to be returned. Multiple values are supported
         * Enum: Accepted, InProgress, Completed, Failed, Expired
         */
        public String status;
  public ListDataExportTasksParameters status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * Page number to be retrieved; value range is > 0
         * Default: 1
         */
        public Long page;
  public ListDataExportTasksParameters page(Long page)
  {
    this.page = page;
    return this;
  }
  

        /**
         * Number of records to be returned per page; value range is 1 - 250
         * Default: 30
         */
        public Long perPage;
  public ListDataExportTasksParameters perPage(Long perPage)
  {
    this.perPage = perPage;
    return this;
  }
  
}
