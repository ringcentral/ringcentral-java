package com.ringcentral.paths.restapi.account.telephony.sessions.parties.transfer

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/transfer"
    }

    /**
     * Operation: Transfer Call Party
     * Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/transfer
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun post(transferTarget: com.ringcentral.definitions.TransferTarget): com.ringcentral.definitions.CallParty? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), transferTarget)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.CallParty::class.java)

    }

}
