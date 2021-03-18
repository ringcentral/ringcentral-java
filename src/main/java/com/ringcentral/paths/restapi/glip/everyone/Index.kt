package com.ringcentral.paths.restapi.glip.everyone

class Index(val parent: com.ringcentral.paths.restapi.glip.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/everyone"
    }

    /**
     * Operation: Get Everyone Chat
     * Http Get /restapi/v1.0/glip/everyone
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun get(): com.ringcentral.definitions.GlipEveryoneInfo? {
        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.GlipEveryoneInfo::class.java
        )

    }


    /**
     * Operation: Update Everyone Сhat
     * Http Patch /restapi/v1.0/glip/everyone
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun patch(updateGlipEveryoneRequest: com.ringcentral.definitions.UpdateGlipEveryoneRequest): com.ringcentral.definitions.GlipEveryoneInfo? {
        val rb: okhttp3.ResponseBody = rc.patch(this.path(), updateGlipEveryoneRequest)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.GlipEveryoneInfo::class.java
        )

    }

}
