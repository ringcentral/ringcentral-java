package com.ringcentral.paths.restapi.account.telephony.sessions.parties.bringin

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/bring-in"
    }

    /**
     * Operation: Bring-In Call Party
     * Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/bring-in
     */
    fun post(addPartyRequest: com.ringcentral.definitions.AddPartyRequest): com.ringcentral.definitions.CallParty? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), addPartyRequest)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.CallParty::class.java)

    }

}
