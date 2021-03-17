package com.ringcentral.paths.restapi.glip.dataexport

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val taskId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && taskId != null) {
            return "${parent.path()}/data-export/${taskId}"
        }

        return "${parent.path()}/data-export"
    }

    /**
     * Operation: Get Data Export Task List
     * Http Get /restapi/v1.0/glip/data-export
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListDataExportTasksParameters? = null): com.ringcentral.definitions.DataExportTaskList? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.DataExportTaskList::class.java
        )

    }


    /**
     * Operation: Create Data Export Task
     * Http Post /restapi/v1.0/glip/data-export
     */
    fun post(createDataExportTaskRequest: com.ringcentral.definitions.CreateDataExportTaskRequest): com.ringcentral.definitions.DataExportTask? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), createDataExportTaskRequest)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.DataExportTask::class.java)

    }


    /**
     * Operation: Get Data Export Task
     * Http Get /restapi/v1.0/glip/data-export/{taskId}
     */
    fun get(): com.ringcentral.definitions.DataExportTask? {
        if (this.taskId == null) {
            throw NullPointerException("taskId");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.DataExportTask::class.java)

    }


    @JvmOverloads
    fun datasets(datasetId: String? = null): com.ringcentral.paths.restapi.glip.dataexport.datasets.Index {
        return com.ringcentral.paths.restapi.glip.dataexport.datasets.Index(this, datasetId)
    }

}
