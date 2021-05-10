package com.ringcentral.definitions;


public class DataExportTaskList {
    /**
     *
     */
    public DataExportTask[] tasks;
    /**
     *
     */
    public GlipDataExportNavigationInfo navigation;
    /**
     *
     */
    public GlipDataExportPagingInfo paging;

    public DataExportTaskList tasks(DataExportTask[] tasks) {
        this.tasks = tasks;
        return this;
    }

    public DataExportTaskList navigation(GlipDataExportNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public DataExportTaskList paging(GlipDataExportPagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
