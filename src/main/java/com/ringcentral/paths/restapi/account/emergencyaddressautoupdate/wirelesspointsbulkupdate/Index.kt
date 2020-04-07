package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspointsbulkupdate

class Index(val parent: com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(): String
        {
            return "${parent.path()}/wireless-points-bulk-update"
        }

      /**
       * Operation: Update Multiple Wireless Points
       * Http Post /restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points-bulk-update
       */
      fun post(updateMultipleWirelessPointsRequest: com.ringcentral.definitions.UpdateMultipleWirelessPointsRequest) : com.ringcentral.definitions.UpdateMultipleWirelessPointsResponse?
      {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), updateMultipleWirelessPointsRequest)
        
        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.UpdateMultipleWirelessPointsResponse::class.java)
      
    }
    
}
