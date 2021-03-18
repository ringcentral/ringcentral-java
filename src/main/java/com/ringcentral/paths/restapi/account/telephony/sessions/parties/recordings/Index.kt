package com.ringcentral.paths.restapi.account.telephony.sessions.parties.recordings

class Index(
    val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index,
    val recordingId: String? = null
) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && recordingId != null) {
            return "${parent.path()}/recordings/${recordingId}"
        }

        return "${parent.path()}/recordings"
    }

    /**
     * Operation: Create Recording
     * Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/recordings
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun post(): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false))

        return rb.string()

    }


    /**
     * Operation: Pause/Resume Recording
     * Http Patch /restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/recordings/{recordingId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    @JvmOverloads
    fun patch(
        callRecordingUpdate: com.ringcentral.definitions.CallRecordingUpdate,
        queryParams: com.ringcentral.definitions.PauseResumeCallRecordingParameters? = null
    ): com.ringcentral.definitions.CallRecording? {
        if (this.recordingId == null) {
            throw NullPointerException("recordingId");
        }

        val rb: okhttp3.ResponseBody = rc.patch(this.path(), callRecordingUpdate, queryParams)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.CallRecording::class.java)

    }

}
