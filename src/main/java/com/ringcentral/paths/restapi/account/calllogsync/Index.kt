package com.ringcentral.paths.restapi.account.calllogsync

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(): String
        {
            return "${parent.path()}/call-log-sync"
        }

      /**
       * Operation: Sync Company Call Log
       * Http Get /restapi/v1.0/account/{accountId}/call-log-sync
       */
      @JvmOverloads fun get(queryParams: com.ringcentral.definitions.SyncAccountCallLogParameters? = null) : com.ringcentral.definitions.AccountCallLogSyncResponse?
      {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)
        
        return com.google.gson.Gson().fromJson(rb.string(), com.ringcentral.definitions.AccountCallLogSyncResponse::class.java)
      
    }
    
}
