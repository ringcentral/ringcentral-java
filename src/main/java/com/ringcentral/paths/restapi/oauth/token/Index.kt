package com.ringcentral.paths.restapi.oauth.token

class Index(val parent: com.ringcentral.paths.restapi.oauth.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/token"
    }

    /**
     * Operation: Get Token
     * Http Post /restapi/oauth/token
     */
    fun post(getTokenRequest: com.ringcentral.definitions.GetTokenRequest): com.ringcentral.definitions.TokenInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), getTokenRequest, null, com.ringcentral.ContentType.FORM)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.TokenInfo::class.java)

    }

}
