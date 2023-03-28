package com.ringcentral.paths.teammessaging.dataexport;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CreateDataExportTaskRequest;
import com.ringcentral.definitions.DataExportTask;
import com.ringcentral.definitions.DataExportTaskList;
import com.ringcentral.definitions.ListDataExportTasksNewParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.Index parent;
    public String taskId;

    public Index(com.ringcentral.paths.teammessaging.Index parent, String taskId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.taskId = taskId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && taskId != null) {
            return parent.path() + "/data-export/" + taskId;
        }
        return parent.path() + "/data-export";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of Glip data export tasks.
     * HTTP Method: get
     * Endpoint: /team-messaging/{version}/data-export
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: Glip
     */
    public DataExportTaskList list(ListDataExportTasksNewParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), DataExportTaskList.class);
    }

    public DataExportTaskList list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates a task for Glip data export and returns a link at which the exported data will be available in future once the task is implemented. The exported data can be downloaded by calling Get Data Export Task method with the specified task ID. Simultaneously no more than 2 tasks per company can be created.
     * HTTP Method: post
     * Endpoint: /team-messaging/{version}/data-export
     * Rate Limit Group: Heavy
     * App Permission: TeamMessaging
     * User Permission: Glip
     */
    public DataExportTask post(CreateDataExportTaskRequest createDataExportTaskRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), createDataExportTaskRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), DataExportTask.class);
    }

    /**
     * Returns the links for downloading Glip data exported within the specified task. If the export task is still in progress, then only the task status will be returned. If the data is ready for downloading, then the list of URLs will be returned.
     * HTTP Method: get
     * Endpoint: /team-messaging/{version}/data-export/{taskId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: Glip
     */
    public DataExportTask get() throws com.ringcentral.RestException, java.io.IOException {
        if (taskId == null) {
            throw new IllegalArgumentException("Parameter taskId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), DataExportTask.class);
    }
}
