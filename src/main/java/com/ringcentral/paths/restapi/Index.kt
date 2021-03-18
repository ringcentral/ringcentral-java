package com.ringcentral.paths.restapi

class Index(val rc: com.ringcentral.RestClient, val apiVersion: String? = "v1.0") {


    fun path(withParameter: Boolean = true): String {
        if (withParameter && apiVersion != null) {
            return "/restapi/${apiVersion}"
        }

        return "/restapi"
    }

    /**
     * Operation: Get API Versions
     * Http Get /restapi
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun list(): com.ringcentral.definitions.GetVersionsResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false))

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.GetVersionsResponse::class.java
        )

    }


    /**
     * Operation: Get Version Info
     * Http Get /restapi/{apiVersion}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun get(): com.ringcentral.definitions.GetVersionResponse? {
        if (this.apiVersion == null) {
            throw NullPointerException("apiVersion");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.GetVersionResponse::class.java
        )

    }


    fun oauth(): com.ringcentral.paths.restapi.oauth.Index {
        return com.ringcentral.paths.restapi.oauth.Index(this)
    }


    @JvmOverloads
    fun account(accountId: String? = "~"): com.ringcentral.paths.restapi.account.Index {
        return com.ringcentral.paths.restapi.account.Index(this, accountId)
    }


    @JvmOverloads
    fun subscription(subscriptionId: String? = null): com.ringcentral.paths.restapi.subscription.Index {
        return com.ringcentral.paths.restapi.subscription.Index(this, subscriptionId)
    }


    fun glip(): com.ringcentral.paths.restapi.glip.Index {
        return com.ringcentral.paths.restapi.glip.Index(this)
    }


    fun dictionary(): com.ringcentral.paths.restapi.dictionary.Index {
        return com.ringcentral.paths.restapi.dictionary.Index(this)
    }


    fun clientinfo(): com.ringcentral.paths.restapi.clientinfo.Index {
        return com.ringcentral.paths.restapi.clientinfo.Index(this)
    }


    fun numberparser(): com.ringcentral.paths.restapi.numberparser.Index {
        return com.ringcentral.paths.restapi.numberparser.Index(this)
    }

}
