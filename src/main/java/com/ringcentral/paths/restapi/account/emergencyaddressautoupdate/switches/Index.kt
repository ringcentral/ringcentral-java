package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switches

class Index(val parent: com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index, val switchId: String? = null) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(withParameter: Boolean = true): String
        {
            if (withParameter && switchId != null)
            {
                return "${parent.path()}/switches/${switchId}"
            }

            return "${parent.path()}/switches"
        }

      /**
       * Operation: Get Account Switch List
       * Http Get /restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches
       */
      @JvmOverloads fun list(queryParams: com.ringcentral.definitions.ListAccountSwitchesParameters? = null) : com.ringcentral.definitions.SwitchesList?
      {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)
        
        return com.google.gson.Gson().fromJson(rb.string(), com.ringcentral.definitions.SwitchesList::class.java)
      
    }
    

      /**
       * Operation: Create Switch
       * Http Post /restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches
       */
      fun post(createSwitchInfo: com.ringcentral.definitions.CreateSwitchInfo) : com.ringcentral.definitions.SwitchInfo?
      {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), createSwitchInfo)
        
        return com.google.gson.Gson().fromJson(rb.string(), com.ringcentral.definitions.SwitchInfo::class.java)
      
    }
    

      /**
       * Operation: Get Switch
       * Http Get /restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches/{switchId}
       */
      fun get() : com.ringcentral.definitions.SwitchInfo?
      {
          if (this.switchId == null)
          {
              throw NullPointerException("switchId");
          }

        val rb: okhttp3.ResponseBody = rc.get(this.path())
        
        return com.google.gson.Gson().fromJson(rb.string(), com.ringcentral.definitions.SwitchInfo::class.java)
      
    }
    

      /**
       * Operation: Update Switch
       * Http Put /restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches/{switchId}
       */
      fun put(updateSwitchInfo: com.ringcentral.definitions.UpdateSwitchInfo) : com.ringcentral.definitions.SwitchInfo?
      {
          if (this.switchId == null)
          {
              throw NullPointerException("switchId");
          }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), updateSwitchInfo)
        
        return com.google.gson.Gson().fromJson(rb.string(), com.ringcentral.definitions.SwitchInfo::class.java)
      
    }
    

      /**
       * Operation: Delete Switch
       * Http Delete /restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches/{switchId}
       */
      fun delete() : String?
      {
          if (this.switchId == null)
          {
              throw NullPointerException("switchId");
          }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())
        
        return rb.string()
        
    }
    
}
