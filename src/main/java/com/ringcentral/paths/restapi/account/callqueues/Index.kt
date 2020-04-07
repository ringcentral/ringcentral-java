package com.ringcentral.paths.restapi.account.callqueues

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val groupId: String? = null) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(withParameter: Boolean = true): String
        {
            if (withParameter && groupId != null)
            {
                return "${parent.path()}/call-queues/${groupId}"
            }

            return "${parent.path()}/call-queues"
        }

      /**
       * Operation: Get Call Queues
       * Http Get /restapi/v1.0/account/{accountId}/call-queues
       */
      @JvmOverloads fun list(queryParams: com.ringcentral.definitions.ListCallQueuesParameters? = null) : com.ringcentral.definitions.CallQueues?
      {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)
        
        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.CallQueues::class.java)
      
    }
    

      /**
       * Operation: Get Call Queue
       * Http Get /restapi/v1.0/account/{accountId}/call-queues/{groupId}
       */
      fun get() : com.ringcentral.definitions.CallQueueDetails?
      {
          if (this.groupId == null)
          {
              throw NullPointerException("groupId");
          }

        val rb: okhttp3.ResponseBody = rc.get(this.path())
        
        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.CallQueueDetails::class.java)
      
    }
    

      /**
       * Operation: Update Call Queue
       * Http Put /restapi/v1.0/account/{accountId}/call-queues/{groupId}
       */
      fun put(callQueueUpdateDetails: com.ringcentral.definitions.CallQueueUpdateDetails) : com.ringcentral.definitions.CallQueueDetails?
      {
          if (this.groupId == null)
          {
              throw NullPointerException("groupId");
          }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), callQueueUpdateDetails)
        
        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.CallQueueDetails::class.java)
      
    }
    


      fun presence() : com.ringcentral.paths.restapi.account.callqueues.presence.Index
      {
        return com.ringcentral.paths.restapi.account.callqueues.presence.Index(this)
      }
    


      fun members() : com.ringcentral.paths.restapi.account.callqueues.members.Index
      {
        return com.ringcentral.paths.restapi.account.callqueues.members.Index(this)
      }
    


      fun bulkassign() : com.ringcentral.paths.restapi.account.callqueues.bulkassign.Index
      {
        return com.ringcentral.paths.restapi.account.callqueues.bulkassign.Index(this)
      }
    
}