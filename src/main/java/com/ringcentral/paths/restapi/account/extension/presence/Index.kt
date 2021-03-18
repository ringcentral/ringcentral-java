package com.ringcentral.paths.restapi.account.extension.presence

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/presence"
    }

    /**
     * Operation: Get User Presence Status
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/presence
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ReadUserPresenceStatusParameters? = null): com.ringcentral.definitions.GetPresenceInfo? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.GetPresenceInfo::class.java)

    }


    /**
     * Operation: Update User Presence Status
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/presence
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun put(presenceInfoRequest: com.ringcentral.definitions.PresenceInfoRequest): com.ringcentral.definitions.PresenceInfoResponse? {
        val rb: okhttp3.ResponseBody = rc.put(this.path(), presenceInfoRequest)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.PresenceInfoResponse::class.java
        )

    }

}
