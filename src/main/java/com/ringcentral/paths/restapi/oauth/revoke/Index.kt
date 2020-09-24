package com.ringcentral.paths.restapi.oauth.revoke

class Index(val parent: com.ringcentral.paths.restapi.oauth.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/revoke"
    }

    /**
     * Operation: Revoke Token
     * Http Post /restapi/oauth/revoke
     */
    fun post(revokeTokenRequest: com.ringcentral.definitions.RevokeTokenRequest): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), revokeTokenRequest, null, com.ringcentral.ContentType.FORM)

        return rb.string()

    }

}
