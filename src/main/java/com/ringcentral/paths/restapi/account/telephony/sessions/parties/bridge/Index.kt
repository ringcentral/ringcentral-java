package com.ringcentral.paths.restapi.account.telephony.sessions.parties.bridge

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/bridge"
    }

    /**
     * Operation: Bridge Call Party
     * Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/bridge
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun post(bridgeTargetRequest: com.ringcentral.definitions.BridgeTargetRequest): com.ringcentral.definitions.CallParty? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), bridgeTargetRequest)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.CallParty::class.java)

    }

}
