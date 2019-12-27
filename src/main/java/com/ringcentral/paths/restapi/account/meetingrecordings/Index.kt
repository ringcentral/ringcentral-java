package com.ringcentral.paths.restapi.account.meetingrecordings

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/meeting-recordings"
    }

    /**
     * Operation: Get Account Meeting Recordings List
     * Http Get /restapi/v1.0/account/{accountId}/meeting-recordings
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListAccountMeetingRecordingsParameters? = null): com.ringcentral.definitions.ListMeetingRecordingsResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.ListMeetingRecordingsResponse::class.java)

    }

}
