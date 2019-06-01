package com.ringcentral.paths.restapi.account.messagestorereport

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val taskId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && taskId != null) {
            return "${parent.path()}/message-store-report/${taskId}"
        }

        return "${parent.path()}/message-store-report"
    }

    /**
     * Operation: Create Message Store Report
     * Http Post /restapi/v1.0/account/{accountId}/message-store-report
     */
    fun post(createMessageStoreReportRequest: com.ringcentral.definitions.CreateMessageStoreReportRequest): com.ringcentral.definitions.MessageStoreReport? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), createMessageStoreReportRequest)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.MessageStoreReport::class.java)

    }


    /**
     * Operation: Get Message Store Report Task
     * Http Get /restapi/v1.0/account/{accountId}/message-store-report/{taskId}
     */
    fun get(): com.ringcentral.definitions.MessageStoreReport? {
        if (this.taskId == null) {
            throw NullPointerException("taskId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.MessageStoreReport::class.java)

    }


    @JvmOverloads
    fun archive(archiveId: String? = null): com.ringcentral.paths.restapi.account.messagestorereport.archive.Index {
        return com.ringcentral.paths.restapi.account.messagestorereport.archive.Index(this, archiveId)
    }

}