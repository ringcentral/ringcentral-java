package com.ringcentral.paths.restapi.account.addressbookbulkupload.tasks

class Index(val parent: com.ringcentral.paths.restapi.account.addressbookbulkupload.Index, val taskId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && taskId != null) {
            return "${parent.path()}/tasks/${taskId}"
        }

        return "${parent.path()}/tasks"
    }

    /**
     * Operation: Get Contacts Update Task
     * Http Get /restapi/v1.0/account/{accountId}/address-book-bulk-upload/tasks/{taskId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun get(): com.ringcentral.definitions.AddressBookBulkUploadResponse? {
        if (this.taskId == null) {
            throw NullPointerException("taskId");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.AddressBookBulkUploadResponse::class.java
        )

    }

}
