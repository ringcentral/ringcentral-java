package com.ringcentral.paths.restapi.account.extension.sms

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/sms"
    }

    /**
     * Operation: Send SMS
     * Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/sms
     */
    fun post(createSMSMessage: com.ringcentral.definitions.CreateSMSMessage): com.ringcentral.definitions.GetSMSMessageInfoResponse? {
        val rb: okhttp3.ResponseBody =
            rc.post(this.path(), createSMSMessage, null, com.ringcentral.ContentType.MULTIPART)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.GetSMSMessageInfoResponse::class.java
        )

    }

}
