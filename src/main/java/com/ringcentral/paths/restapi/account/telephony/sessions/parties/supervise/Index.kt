package com.ringcentral.paths.restapi.account.telephony.sessions.parties.supervise

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(): String
        {
            return "${parent.path()}/supervise"
        }

      /**
       * Operation: Supervise Call Party
       * Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/supervise
       */
      fun post(partySuperviseRequest: com.ringcentral.definitions.PartySuperviseRequest) : com.ringcentral.definitions.PartySuperviseResponse?
      {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), partySuperviseRequest)
        
        return com.google.gson.Gson().fromJson(rb.string(), com.ringcentral.definitions.PartySuperviseResponse::class.java)
      
    }
    
}
