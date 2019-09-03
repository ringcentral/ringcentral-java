package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.users.bulkassign

class Index(val parent: com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.users.Index) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(): String
        {
            return "${parent.path()}/bulk-assign"
        }

      /**
       * Operation: Enable Automatic Location Updates for Users
       * Http Post /restapi/v1.0/account/{accountId}/emergency-address-auto-update/users/bulk-assign
       */
      fun post(bulkAssignAutomaticaLocationUpdatesUsers: com.ringcentral.definitions.BulkAssignAutomaticaLocationUpdatesUsers) : String?
      {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), bulkAssignAutomaticaLocationUpdatesUsers)
        
        return rb.string()
        
    }
    
}
