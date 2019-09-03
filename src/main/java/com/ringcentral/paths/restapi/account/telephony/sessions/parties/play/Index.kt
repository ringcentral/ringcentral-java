package com.ringcentral.paths.restapi.account.telephony.sessions.parties.play

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(): String
        {
            return "${parent.path()}/play"
        }

      /**
       * Operation: Play audio files into a party.
       * Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/play
       */
      fun post(playTarget: com.ringcentral.definitions.PlayTarget) : String?
      {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), playTarget)
        
        return rb.string()
        
    }
    
}
