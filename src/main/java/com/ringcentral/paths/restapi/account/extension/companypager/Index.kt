package com.ringcentral.paths.restapi.account.extension.companypager

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/company-pager"
    }

    /**
     * Operation: Create Internal Text Message
     * Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/company-pager
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun post(createInternalTextMessageRequest: com.ringcentral.definitions.CreateInternalTextMessageRequest): com.ringcentral.definitions.GetInternalTextMessageInfoResponse? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), createInternalTextMessageRequest)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.GetInternalTextMessageInfoResponse::class.java
        )

    }

}
