package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspointsbulkcreate

class Index(val parent: com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(): String
        {
            return "${parent.path()}/wireless-points-bulk-create"
        }

      /**
       * Operation: Create Multiple Wireless Points
       * Http Post /restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points-bulk-create
       */
      fun post(createMultipleWirelessPointsRequest: com.ringcentral.definitions.CreateMultipleWirelessPointsRequest) : com.ringcentral.definitions.CreateMultipleWirelessPointsResponse?
      {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), createMultipleWirelessPointsRequest)
        
        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.CreateMultipleWirelessPointsResponse::class.java)
      
    }
    
}
