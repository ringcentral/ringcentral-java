package com.ringcentral.paths.restapi.account.extensionbulkupdate

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/extension-bulk-update"
    }

    /**
     * Operation: Update Multiple Extensions
     * Http Post /restapi/v1.0/account/{accountId}/extension-bulk-update
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun post(extensionBulkUpdateRequest: com.ringcentral.definitions.ExtensionBulkUpdateRequest): com.ringcentral.definitions.ExtensionBulkUpdateTaskResource? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), extensionBulkUpdateRequest)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.ExtensionBulkUpdateTaskResource::class.java
        )

    }


    @JvmOverloads
    fun tasks(taskId: String? = null): com.ringcentral.paths.restapi.account.extensionbulkupdate.tasks.Index {
        return com.ringcentral.paths.restapi.account.extensionbulkupdate.tasks.Index(this, taskId)
    }

}
