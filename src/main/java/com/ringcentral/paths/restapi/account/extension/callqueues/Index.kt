package com.ringcentral.paths.restapi.account.extension.callqueues

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/call-queues"
    }

    /**
     * Operation: Update User Call Queues
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/call-queues
     */
    fun put(userCallQueues: com.ringcentral.definitions.UserCallQueues): com.ringcentral.definitions.UserCallQueues? {
        val rb: okhttp3.ResponseBody = rc.put(this.path(), userCallQueues)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.UserCallQueues::class.java)

    }

}
