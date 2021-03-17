package com.ringcentral.definitions;


public class DataExportTaskList
{
    /**
         */
        public DataExportTask[] tasks;
  public DataExportTaskList tasks(DataExportTask[] tasks)
  {
    this.tasks = tasks;
    return this;
  }
  

        /**
         */
        public GlipDataExportNavigationInfo navigation;
  public DataExportTaskList navigation(GlipDataExportNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         */
        public GlipDataExportPagingInfo paging;
  public DataExportTaskList paging(GlipDataExportPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
