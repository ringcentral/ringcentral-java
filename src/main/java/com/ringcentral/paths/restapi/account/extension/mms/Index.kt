package com.ringcentral.paths.restapi.account.extension.mms

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(): String
        {
            return "${parent.path()}/mms"
        }

      /**
       * Operation: Create MMS Message
       * Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/mms
       */
      fun post(createSMSMessage: com.ringcentral.definitions.CreateSMSMessage) : com.ringcentral.definitions.GetMessageInfoResponse?
      {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), createSMSMessage, null, com.ringcentral.ContentType.MULTIPART)
        
        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GetMessageInfoResponse::class.java)
      
    }
    

/**
     * Operation: Create MMS Message
     * Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/mms
     */
    fun post(createMMSMessage: com.ringcentral.definitions.CreateMMSMessage): com.ringcentral.definitions.GetMessageInfoResponse? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), createMMSMessage, null, com.ringcentral.ContentType.MULTIPART)
        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GetMessageInfoResponse::class.java)
    }
}