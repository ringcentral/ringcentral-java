package com.ringcentral.paths.restapi.account.extension.mms

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/mms"
    }

    /**
     * Operation: Create MMS Message
     * Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/mms
     */
    fun post(createMMSMessage: com.ringcentral.definitions.CreateMMSMessage): com.ringcentral.definitions.GetMessageInfoResponse? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), createMMSMessage, null, com.ringcentral.ContentType.MULTIPART)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.GetMessageInfoResponse::class.java)

    }

}
