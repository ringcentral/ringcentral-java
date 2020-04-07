package com.ringcentral.paths.restapi.account.extension.unifiedpresence

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(): String
        {
            return "${parent.path()}/unified-presence"
        }

      /**
       * Operation: Get Unified Presence
       * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/unified-presence
       */
      fun get() : com.ringcentral.definitions.UnifiedPresence?
      {
        val rb: okhttp3.ResponseBody = rc.get(this.path())
        
        return com.google.gson.Gson().fromJson(rb.string(), com.ringcentral.definitions.UnifiedPresence::class.java)
      
    }
    

      /**
       * Operation: Update Unified Presence
       * Http Patch /restapi/v1.0/account/{accountId}/extension/{extensionId}/unified-presence
       */
      fun patch(updateUnifiedPresence: com.ringcentral.definitions.UpdateUnifiedPresence) : com.ringcentral.definitions.UnifiedPresence?
      {
        val rb: okhttp3.ResponseBody = rc.patch(this.path(), updateUnifiedPresence)
        
        return com.google.gson.Gson().fromJson(rb.string(), com.ringcentral.definitions.UnifiedPresence::class.java)
      
    }
    
}
