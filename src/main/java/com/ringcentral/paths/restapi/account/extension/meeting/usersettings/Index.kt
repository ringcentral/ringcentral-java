package com.ringcentral.paths.restapi.account.extension.meeting.usersettings

class Index(val parent: com.ringcentral.paths.restapi.account.extension.meeting.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/user-settings"
    }

    /**
     * Operation: Get Meeting User Settings
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/user-settings
     */
    fun get(): com.ringcentral.definitions.MeetingUserSettingsResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.MeetingUserSettingsResponse::class.java
        )

    }

}
