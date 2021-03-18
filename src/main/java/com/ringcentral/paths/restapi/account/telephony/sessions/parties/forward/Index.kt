package com.ringcentral.paths.restapi.account.telephony.sessions.parties.forward

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/forward"
    }

    /**
     * Operation: Forward Call Party
     * Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/forward
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun post(forwardTarget: com.ringcentral.definitions.ForwardTarget): com.ringcentral.definitions.CallParty? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), forwardTarget)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.CallParty::class.java)

    }

}
