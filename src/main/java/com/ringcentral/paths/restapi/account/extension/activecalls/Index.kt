package com.ringcentral.paths.restapi.account.extension.activecalls

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/active-calls"
    }

    /**
     * Operation: Get User Active Calls
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/active-calls
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListExtensionActiveCallsParameters? = null): com.ringcentral.definitions.UserActiveCallsResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.UserActiveCallsResponse::class.java
        )

    }

}
