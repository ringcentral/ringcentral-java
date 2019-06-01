package com.ringcentral.paths.restapi.account.recording

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val recordingId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && recordingId != null) {
            return "${parent.path()}/recording/${recordingId}"
        }

        return "${parent.path()}/recording"
    }

    /**
     * Operation: Get Call Recording
     * Http Get /restapi/v1.0/account/{accountId}/recording/{recordingId}
     */
    fun get(): com.ringcentral.definitions.GetCallRecordingResponse? {
        if (this.recordingId == null) {
            throw NullPointerException("recordingId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GetCallRecordingResponse::class.java)

    }


    fun content(): com.ringcentral.paths.restapi.account.recording.content.Index {
        return com.ringcentral.paths.restapi.account.recording.content.Index(this)
    }

}