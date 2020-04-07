package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.users

class Index(val parent: com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(): String
        {
            return "${parent.path()}/users"
        }

      /**
       * Operation: Get User List
       * Http Get /restapi/v1.0/account/{accountId}/emergency-address-auto-update/users
       */
      @JvmOverloads fun get(queryParams: com.ringcentral.definitions.ListAutomaticLocationUpdatesUsersParameters? = null) : com.ringcentral.definitions.AutomaticLocationUpdatesUserList?
      {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)
        
        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.AutomaticLocationUpdatesUserList::class.java)
      
    }
    


      fun bulkassign() : com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.users.bulkassign.Index
      {
        return com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.users.bulkassign.Index(this)
      }
    
}