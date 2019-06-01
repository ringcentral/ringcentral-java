package com.ringcentral.paths.restapi.account.telephony.sessions.parties

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.Index, val partyId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && partyId != null) {
            return "${parent.path()}/parties/${partyId}"
        }

        return "${parent.path()}/parties"
    }

    /**
     * Operation: Get Call Party Status
     * Http Get /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}
     */
    fun get(): com.ringcentral.definitions.CallParty? {
        if (this.partyId == null) {
            throw NullPointerException("partyId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.CallParty::class.java)

    }


    /**
     * Operation: Update Call Party
     * Http Patch /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}
     */
    fun patch(partyUpdateRequest: com.ringcentral.definitions.PartyUpdateRequest): com.ringcentral.definitions.CallParty? {
        if (this.partyId == null) {
            throw NullPointerException("partyId")
        }

        val rb: okhttp3.ResponseBody = rc.patch(this.path(), partyUpdateRequest)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.CallParty::class.java)

    }


    fun hold(): com.ringcentral.paths.restapi.account.telephony.sessions.parties.hold.Index {
        return com.ringcentral.paths.restapi.account.telephony.sessions.parties.hold.Index(this)
    }


    fun unhold(): com.ringcentral.paths.restapi.account.telephony.sessions.parties.unhold.Index {
        return com.ringcentral.paths.restapi.account.telephony.sessions.parties.unhold.Index(this)
    }


    fun reject(): com.ringcentral.paths.restapi.account.telephony.sessions.parties.reject.Index {
        return com.ringcentral.paths.restapi.account.telephony.sessions.parties.reject.Index(this)
    }


    fun transfer(): com.ringcentral.paths.restapi.account.telephony.sessions.parties.transfer.Index {
        return com.ringcentral.paths.restapi.account.telephony.sessions.parties.transfer.Index(this)
    }


    fun forward(): com.ringcentral.paths.restapi.account.telephony.sessions.parties.forward.Index {
        return com.ringcentral.paths.restapi.account.telephony.sessions.parties.forward.Index(this)
    }


    fun flip(): com.ringcentral.paths.restapi.account.telephony.sessions.parties.flip.Index {
        return com.ringcentral.paths.restapi.account.telephony.sessions.parties.flip.Index(this)
    }


    @JvmOverloads
    fun recordings(recordingId: String? = null): com.ringcentral.paths.restapi.account.telephony.sessions.parties.recordings.Index {
        return com.ringcentral.paths.restapi.account.telephony.sessions.parties.recordings.Index(this, recordingId)
    }

}