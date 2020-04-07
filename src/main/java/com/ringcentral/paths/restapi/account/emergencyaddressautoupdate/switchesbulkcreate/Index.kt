package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switchesbulkcreate

class Index(val parent: com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(): String
        {
            return "${parent.path()}/switches-bulk-create"
        }

      /**
       * Operation: Create Multiple Switches
       * Http Post /restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches-bulk-create
       */
      fun post(createMultipleSwitchesRequest: com.ringcentral.definitions.CreateMultipleSwitchesRequest) : com.ringcentral.definitions.CreateMultipleSwitchesResponse?
      {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), createMultipleSwitchesRequest)
        
        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.CreateMultipleSwitchesResponse::class.java)
      
    }
    
}
