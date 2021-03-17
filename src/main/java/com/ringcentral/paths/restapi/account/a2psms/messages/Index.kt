package com.ringcentral.paths.restapi.account.a2psms.messages

class Index(val parent: com.ringcentral.paths.restapi.account.a2psms.Index, val messageId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && messageId != null) {
            return "${parent.path()}/messages/${messageId}"
        }

        return "${parent.path()}/messages"
    }

    /**
     * Operation: Get A2P SMS List
     * Http Get /restapi/v1.0/account/{accountId}/a2p-sms/messages
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListA2PsmsParameters? = null): com.ringcentral.definitions.MessageListResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.MessageListResponse::class.java
        )

    }


    /**
     * Operation: Get A2P SMS
     * Http Get /restapi/v1.0/account/{accountId}/a2p-sms/messages/{messageId}
     */
    fun get(): com.ringcentral.definitions.MessageDetailsResponse? {
        if (this.messageId == null) {
            throw NullPointerException("messageId");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.MessageDetailsResponse::class.java
        )

    }

}
