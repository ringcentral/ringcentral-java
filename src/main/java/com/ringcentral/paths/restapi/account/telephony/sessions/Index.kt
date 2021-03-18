package com.ringcentral.paths.restapi.account.telephony.sessions

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.Index, val telephonySessionId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && telephonySessionId != null) {
            return "${parent.path()}/sessions/${telephonySessionId}"
        }

        return "${parent.path()}/sessions"
    }

    /**
     * Operation: Get Call Session Status
     * Http Get /restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ReadCallSessionStatusParameters? = null): com.ringcentral.definitions.CallSession? {
        if (this.telephonySessionId == null) {
            throw NullPointerException("telephonySessionId");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.CallSession::class.java)

    }


    /**
     * Operation: Drop Call Session
     * Http Delete /restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun delete(): String? {
        if (this.telephonySessionId == null) {
            throw NullPointerException("telephonySessionId");
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())

        return rb.string()

    }


    @JvmOverloads
    fun parties(partyId: String? = null): com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index {
        return com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index(this, partyId)
    }


    fun supervise(): com.ringcentral.paths.restapi.account.telephony.sessions.supervise.Index {
        return com.ringcentral.paths.restapi.account.telephony.sessions.supervise.Index(this)
    }

}
