package com.ringcentral.definitions;


public class CreateDataExportTaskRequest
{
    /**
         * Starting time for data collection. The default value is `timeTo` minus 24 hours. Max allowed time frame between `timeFrom` and `timeTo` is 6 months
         */
        public String timeFrom;
  public CreateDataExportTaskRequest timeFrom(String timeFrom)
  {
    this.timeFrom = timeFrom;
    return this;
  }
  

        /**
         * Ending time for data collection. The default value is current time. Max allowed time frame between `timeFrom` and `timeTo` is 6 months
         */
        public String timeTo;
  public CreateDataExportTaskRequest timeTo(String timeTo)
  {
    this.timeTo = timeTo;
    return this;
  }
  

        /**
         */
        public DataExportTaskContactInfo[] contacts;
  public CreateDataExportTaskRequest contacts(DataExportTaskContactInfo[] contacts)
  {
    this.contacts = contacts;
    return this;
  }
  

        /**
         * List of chats from which the data (posts, files, tasks, events, notes, etc.) will be collected. Maximum number of chats supported is 10
         */
        public String[] chatIds;
  public CreateDataExportTaskRequest chatIds(String[] chatIds)
  {
    this.chatIds = chatIds;
    return this;
  }
  
}
