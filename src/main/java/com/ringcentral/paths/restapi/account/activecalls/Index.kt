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
    fun get(queryParams: com.ringcentral.definitions.ListCompanyActiveCallsParameters? = null): com.ringcentral.definitions.CompanyActiveCallsResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.CompanyActiveCallsResponse::class.java
        )

    }

}
