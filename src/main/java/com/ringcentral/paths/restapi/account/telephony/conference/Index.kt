package com.ringcentral.paths.restapi.account.telephony.conference

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/conference"
    }

    /**
     * Operation: Start Conference Call Session
     * Http Post /restapi/v1.0/account/{accountId}/telephony/conference
     */
    fun post(): com.ringcentral.definitions.CallSessionObject? {
        val rb: okhttp3.ResponseBody = rc.post(this.path())

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.CallSessionObject::class.java)

    }

}
