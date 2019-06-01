package com.ringcentral.paths.restapi.account.extension.meeting.end

class Index(val parent: com.ringcentral.paths.restapi.account.extension.meeting.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/end"
    }

    /**
     * Operation: End Meeting
     * Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}/end
     */
    fun post(): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path())

        return rb.string()

    }

}
