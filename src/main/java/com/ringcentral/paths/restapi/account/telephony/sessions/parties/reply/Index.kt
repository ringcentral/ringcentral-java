package com.ringcentral.paths.restapi.account.telephony.sessions.parties.reply

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/reply"
    }

    /**
     * Operation: Reply with Text
     * Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/reply
     */
    fun post(callPartyReply: com.ringcentral.definitions.CallPartyReply): com.ringcentral.definitions.ReplyParty? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), callPartyReply)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.ReplyParty::class.java)

    }

}
