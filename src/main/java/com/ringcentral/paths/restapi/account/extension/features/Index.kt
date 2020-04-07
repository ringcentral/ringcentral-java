package com.ringcentral.paths.restapi.account.extension.features

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(): String
        {
            return "${parent.path()}/features"
        }

      /**
       * Operation: Get User Features
       * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/features
       */
      @JvmOverloads fun get(queryParams: com.ringcentral.definitions.ReadUserFeaturesParameters? = null) : com.ringcentral.definitions.FeatureList?
      {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)
        
        return com.google.gson.Gson().fromJson(rb.string(), com.ringcentral.definitions.FeatureList::class.java)
      
    }
    
}
