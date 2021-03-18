package com.ringcentral.paths.restapi.account.extension.meeting.invitation

class Index(val parent: com.ringcentral.paths.restapi.account.extension.meeting.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/invitation"
    }

    /**
     * Operation: Get Meeting Invitation
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}/invitation
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun get(): com.ringcentral.definitions.PublicMeetingInvitationResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.PublicMeetingInvitationResponse::class.java
        )

    }

}
