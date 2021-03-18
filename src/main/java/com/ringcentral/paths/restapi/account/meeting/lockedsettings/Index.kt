package com.ringcentral.paths.restapi.account.meeting.lockedsettings

class Index(val parent: com.ringcentral.paths.restapi.account.meeting.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/locked-settings"
    }

    /**
     * Operation: Get Locked Meeting Settings
     * Http Get /restapi/v1.0/account/{accountId}/meeting/locked-settings
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun get(): com.ringcentral.definitions.AccountLockedSettingResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.AccountLockedSettingResponse::class.java
        )

    }

}
