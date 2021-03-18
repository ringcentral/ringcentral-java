package com.ringcentral.paths.restapi.account.extension.messagestore

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index, val messageId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && messageId != null) {
            return "${parent.path()}/message-store/${messageId}"
        }

        return "${parent.path()}/message-store"
    }

    /**
     * Operation: Get Message List
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListMessagesParameters? = null): com.ringcentral.definitions.GetMessageList? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.GetMessageList::class.java)

    }


    /**
     * Operation: Get Message
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun get(): com.ringcentral.definitions.GetMessageInfoResponse? {
        if (this.messageId == null) {
            throw NullPointerException("messageId");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.GetMessageInfoResponse::class.java
        )

    }


    /**
     * Operation: Update Message List
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    @JvmOverloads
    fun put(
        updateMessageRequest: com.ringcentral.definitions.UpdateMessageRequest,
        queryParams: com.ringcentral.definitions.UpdateMessageParameters? = null
    ): com.ringcentral.definitions.GetMessageInfoResponse? {
        if (this.messageId == null) {
            throw NullPointerException("messageId");
        }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), updateMessageRequest, queryParams)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.GetMessageInfoResponse::class.java
        )

    }


    /**
     * Operation: Delete Message
     * Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    @JvmOverloads
    fun delete(queryParams: com.ringcentral.definitions.DeleteMessageParameters? = null): String? {
        if (this.messageId == null) {
            throw NullPointerException("messageId");
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path(), queryParams)

        return rb.string()

    }


    @JvmOverloads
    fun content(attachmentId: String? = null): com.ringcentral.paths.restapi.account.extension.messagestore.content.Index {
        return com.ringcentral.paths.restapi.account.extension.messagestore.content.Index(this, attachmentId)
    }

}
