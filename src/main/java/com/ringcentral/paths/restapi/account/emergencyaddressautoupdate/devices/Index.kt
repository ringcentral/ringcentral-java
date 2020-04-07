package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.devices

class Index(val parent: com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(): String
        {
            return "${parent.path()}/devices"
        }

      /**
       * Operation: Get Device List
       * Http Get /restapi/v1.0/account/{accountId}/emergency-address-auto-update/devices
       */
      @JvmOverloads fun get(queryParams: com.ringcentral.definitions.ListDevicesAutomaticLocationUpdatesParameters? = null) : com.ringcentral.definitions.ListDevicesAutomaticLocationUpdates?
      {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)
        
        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.ListDevicesAutomaticLocationUpdates::class.java)
      
    }
    


      fun bulkassign() : com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.devices.bulkassign.Index
      {
        return com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.devices.bulkassign.Index(this)
      }
    
}