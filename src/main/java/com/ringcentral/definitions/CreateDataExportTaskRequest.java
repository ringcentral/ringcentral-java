package com.ringcentral.definitions;


public class CreateDataExportTaskRequest {
    /**
     * Starting time for data collection. The default value is current time minus 24 hours. If `dateTo` is not specified then its value is set to `dateFrom` plus 24 hours. The specified time range should not be greater than 7 days
     */
    public String dateFrom;
    /**
     * Ending time for data collection. The default value is current time. If `dateFrom` is not specified then its value is set to `dateTo` minus 24 hours. The specified time range should not be greater than 7 days
     */
    public String dateTo;
    /**
     * List of users which data is collected. The following data will be exported: posts, tasks, events, etc. posted by the user(s); posts addressing the user(s) via direct and @Mentions; tasks assigned to the listed user(s). The list of 30 users per request is supported.
     */
    public String[] userIds;
    /**
     * List of chats from which the data (posts, files, tasks, events, notes, etc.) will be collected
     */
    public String[] chatIds;

    public CreateDataExportTaskRequest dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public CreateDataExportTaskRequest dateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    public CreateDataExportTaskRequest userIds(String[] userIds) {
        this.userIds = userIds;
        return this;
    }

    public CreateDataExportTaskRequest chatIds(String[] chatIds) {
        this.chatIds = chatIds;
        return this;
    }

}
