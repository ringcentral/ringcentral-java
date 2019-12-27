package com.ringcentral.paths.restapi.account.extension.calllogsync

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/call-log-sync"
    }

    /**
     * Operation: Sync User Call Log
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log-sync
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.SyncUserCallLogParameters? = null): com.ringcentral.definitions.CallLogSync? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.CallLogSync::class.java)

    }

}
