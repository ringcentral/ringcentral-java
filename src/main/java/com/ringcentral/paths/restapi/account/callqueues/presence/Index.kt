package com.ringcentral.paths.restapi.account.callqueues.presence

class Index(val parent: com.ringcentral.paths.restapi.account.callqueues.Index) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(): String
        {
            return "${parent.path()}/presence"
        }

      /**
       * Operation: Get Call Queue Presence
       * Http Get /restapi/v1.0/account/{accountId}/call-queues/{groupId}/presence
       */
      fun get() : com.ringcentral.definitions.CallQueuePresence?
      {
        val rb: okhttp3.ResponseBody = rc.get(this.path())
        
        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.CallQueuePresence::class.java)
      
    }
    

      /**
       * Operation: Update Call Queue Presence
       * Http Put /restapi/v1.0/account/{accountId}/call-queues/{groupId}/presence
       */
      fun put(callQueueUpdatePresence: com.ringcentral.definitions.CallQueueUpdatePresence) : com.ringcentral.definitions.CallQueuePresence?
      {
        val rb: okhttp3.ResponseBody = rc.put(this.path(), callQueueUpdatePresence)
        
        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.CallQueuePresence::class.java)
      
    }
    
}
