package com.ringcentral.paths.restapi.account.extension.favorite

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(): String
        {
            return "${parent.path()}/favorite"
        }

      /**
       * Operation: Get Favorite Contact List
       * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/favorite
       */
      fun get() : com.ringcentral.definitions.FavoriteContactList?
      {
        val rb: okhttp3.ResponseBody = rc.get(this.path())
        
        return com.google.gson.Gson().fromJson(rb.string(), com.ringcentral.definitions.FavoriteContactList::class.java)
      
    }
    

      /**
       * Operation: Update Favorite Contact List
       * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/favorite
       */
      fun put(favoriteCollection: com.ringcentral.definitions.FavoriteCollection) : com.ringcentral.definitions.FavoriteContactList?
      {
        val rb: okhttp3.ResponseBody = rc.put(this.path(), favoriteCollection)
        
        return com.google.gson.Gson().fromJson(rb.string(), com.ringcentral.definitions.FavoriteContactList::class.java)
      
    }
    
}
