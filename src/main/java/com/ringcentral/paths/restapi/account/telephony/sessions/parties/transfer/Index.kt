package com.ringcentral.paths.restapi.account.telephony.sessions.parties.transfer

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/transfer"
    }

    /**
     * Operation: Transfer Call Party
     * Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}/transfer
     */
    fun post(transferTarget: com.ringcentral.definitions.TransferTarget): com.ringcentral.definitions.CallParty? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), transferTarget)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.CallParty::class.java)

    }

}
