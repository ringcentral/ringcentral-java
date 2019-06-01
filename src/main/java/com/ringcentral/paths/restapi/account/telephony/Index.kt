package com.ringcentral.paths.restapi.account.telephony

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/telephony"
    }


    fun callout(): com.ringcentral.paths.restapi.account.telephony.callout.Index {
        return com.ringcentral.paths.restapi.account.telephony.callout.Index(this)
    }


    @JvmOverloads
    fun sessions(sessionId: String? = null): com.ringcentral.paths.restapi.account.telephony.sessions.Index {
        return com.ringcentral.paths.restapi.account.telephony.sessions.Index(this, sessionId)
    }

}