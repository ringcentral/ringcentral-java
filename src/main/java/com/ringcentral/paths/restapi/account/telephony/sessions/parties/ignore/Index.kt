package com.ringcentral.paths.restapi.account.telephony.sessions.parties.ignore

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/ignore"
    }

    /**
     * Operation: Ignore Call in Queue
     * Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/ignore
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun post(ignoreRequestBody: com.ringcentral.definitions.IgnoreRequestBody): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), ignoreRequestBody)

        return rb.string()

    }

}
