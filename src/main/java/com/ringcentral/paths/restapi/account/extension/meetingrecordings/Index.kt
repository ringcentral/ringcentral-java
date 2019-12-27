package com.ringcentral.paths.restapi.account.extension.meetingrecordings

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/meeting-recordings"
    }

    /**
     * Operation: Get User Meeting Recordings List
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting-recordings
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListUserMeetingRecordingsParameters? = null): com.ringcentral.definitions.ListMeetingRecordingsResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.ListMeetingRecordingsResponse::class.java)

    }

}
