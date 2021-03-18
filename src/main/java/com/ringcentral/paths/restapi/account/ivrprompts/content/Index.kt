package com.ringcentral.paths.restapi.account.ivrprompts.content

class Index(val parent: com.ringcentral.paths.restapi.account.ivrprompts.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/content"
    }

    /**
     * Operation: Get IVR Prompt Content
     * Http Get /restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}/content
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun get(): ByteArray? {
        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return rb.bytes()

    }

}
