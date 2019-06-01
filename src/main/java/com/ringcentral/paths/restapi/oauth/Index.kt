package com.ringcentral.paths.restapi.oauth

class Index(val parent: com.ringcentral.paths.restapi.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/oauth"
    }


    fun token(): com.ringcentral.paths.restapi.oauth.token.Index {
        return com.ringcentral.paths.restapi.oauth.token.Index(this)
    }


    fun revoke(): com.ringcentral.paths.restapi.oauth.revoke.Index {
        return com.ringcentral.paths.restapi.oauth.revoke.Index(this)
    }

}