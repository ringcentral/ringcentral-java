package com.ringcentral.paths.restapi.account.telephony.sessions.parties.reject

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/reject"
    }

    /**
     * Operation: Reject Call Party
     * Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/reject
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun post(): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path())

        return rb.string()

    }

}
