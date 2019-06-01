package com.ringcentral.paths.restapi.account.activecalls

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/active-calls"
    }

    /**
     * Operation: Get Company Active Calls
     * Http Get /restapi/v1.0/account/{accountId}/active-calls
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListCompanyActiveCallsParameters? = null): com.ringcentral.definitions.ActiveCallsResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.ActiveCallsResponse::class.java)

    }

}
