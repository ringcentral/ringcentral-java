package com.ringcentral.paths.restapi.account.extension.messagestore.content

class Index(val parent: com.ringcentral.paths.restapi.account.extension.messagestore.Index, val attachmentId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && attachmentId != null) {
            return "${parent.path()}/content/${attachmentId}"
        }

        return "${parent.path()}/content"
    }

    /**
     * Operation: Get Message Content
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}/content/{attachmentId}
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ReadMessageContentParameters? = null): ByteArray? {
        if (this.attachmentId == null) {
            throw NullPointerException("attachmentId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return rb.source().readByteArray()

    }

}
