package com.ringcentral.paths.restapi.account.a2psms.batch

class Index(val parent: com.ringcentral.paths.restapi.account.a2psms.Index, val batchId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && batchId != null) {
            return "${parent.path()}/batch/${batchId}"
        }

        return "${parent.path()}/batch"
    }

    /**
     * Operation: Send A2P SMS
     * Http Post /restapi/v1.0/account/{accountId}/a2p-sms/batch
     */
    fun post(messageBatchCreateRequest: com.ringcentral.definitions.MessageBatchCreateRequest): com.ringcentral.definitions.MessageBatchResponse? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), messageBatchCreateRequest)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.MessageBatchResponse::class.java)

    }


    /**
     * Operation: Get A2P SMS Batch
     * Http Get /restapi/v1.0/account/{accountId}/a2p-sms/batch/{batchId}
     */
    fun get(): com.ringcentral.definitions.MessageBatchResponse? {
        if (this.batchId == null) {
            throw NullPointerException("batchId");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.MessageBatchResponse::class.java)

    }

}
