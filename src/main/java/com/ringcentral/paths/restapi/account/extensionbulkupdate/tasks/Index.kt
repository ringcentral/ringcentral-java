package com.ringcentral.paths.restapi.account.extensionbulkupdate.tasks

class Index(val parent: com.ringcentral.paths.restapi.account.extensionbulkupdate.Index, val taskId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && taskId != null) {
            return "${parent.path()}/tasks/${taskId}"
        }

        return "${parent.path()}/tasks"
    }

    /**
     * Operation: Get Update Task Status
     * Http Get /restapi/v1.0/account/{accountId}/extension-bulk-update/tasks/{taskId}
     */
    fun get(): com.ringcentral.definitions.ExtensionBulkUpdateTaskResource? {
        if (this.taskId == null) {
            throw NullPointerException("taskId");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.ExtensionBulkUpdateTaskResource::class.java
        )

    }

}
