package com.ringcentral.paths.restapi.account.telephony.sessions.supervise

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/supervise"
    }

    /**
     * Operation: Supervise Call
     * Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/supervise
     */
    fun post(superviseCallSessionRequest: com.ringcentral.definitions.SuperviseCallSessionRequest): com.ringcentral.definitions.SuperviseCallSession? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), superviseCallSessionRequest)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.SuperviseCallSession::class.java)

    }

}
