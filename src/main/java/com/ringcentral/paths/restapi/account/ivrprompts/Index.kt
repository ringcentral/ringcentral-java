package com.ringcentral.paths.restapi.account.ivrprompts

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val promptId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && promptId != null) {
            return "${parent.path()}/ivr-prompts/${promptId}"
        }

        return "${parent.path()}/ivr-prompts"
    }

    /**
     * Operation: Get IVR Prompt List
     * Http Get /restapi/v1.0/account/{accountId}/ivr-prompts
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun list(): com.ringcentral.definitions.IVRPrompts? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false))

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.IVRPrompts::class.java)

    }


    /**
     * Operation: Create IVR Prompts
     * Http Post /restapi/v1.0/account/{accountId}/ivr-prompts
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun post(createIVRPromptRequest: com.ringcentral.definitions.CreateIvrPromptRequest): com.ringcentral.definitions.PromptInfo? {
        val rb: okhttp3.ResponseBody =
            rc.post(this.path(false), createIVRPromptRequest, null, com.ringcentral.ContentType.MULTIPART)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.PromptInfo::class.java)

    }


    /**
     * Operation: Get IVR Prompt
     * Http Get /restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun get(): com.ringcentral.definitions.PromptInfo? {
        if (this.promptId == null) {
            throw NullPointerException("promptId");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.PromptInfo::class.java)

    }


    /**
     * Operation: Update IVR Prompt
     * Http Put /restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun put(updateIVRPromptRequest: com.ringcentral.definitions.UpdateIVRPromptRequest): com.ringcentral.definitions.PromptInfo? {
        if (this.promptId == null) {
            throw NullPointerException("promptId");
        }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), updateIVRPromptRequest)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.PromptInfo::class.java)

    }


    /**
     * Operation: Delete IVR Prompt
     * Http Delete /restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun delete(): String? {
        if (this.promptId == null) {
            throw NullPointerException("promptId");
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())

        return rb.string()

    }


    fun content(): com.ringcentral.paths.restapi.account.ivrprompts.content.Index {
        return com.ringcentral.paths.restapi.account.ivrprompts.content.Index(this)
    }

}
