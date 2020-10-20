package com.ringcentral.paths.restapi.account.a2psms.optouts

class Index(val parent: com.ringcentral.paths.restapi.account.a2psms.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/opt-outs"
    }

    /**
     * Operation: Get Opted Out Numbers
     * Http Get /restapi/v1.0/account/{accountId}/a2p-sms/opt-outs
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ReadA2PsmsOptOutsParameters? = null): com.ringcentral.definitions.OptOutListResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.OptOutListResponse::class.java)

    }

}
