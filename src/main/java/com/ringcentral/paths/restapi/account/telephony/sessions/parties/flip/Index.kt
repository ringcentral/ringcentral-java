package com.ringcentral.paths.restapi.account.telephony.sessions.parties.flip

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/flip"
    }

    /**
     * Operation: Call Flip on Party
     * Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}/flip
     */
    fun post(callPartyFlip: com.ringcentral.definitions.CallPartyFlip): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), callPartyFlip)

        return rb.string()

    }

}
