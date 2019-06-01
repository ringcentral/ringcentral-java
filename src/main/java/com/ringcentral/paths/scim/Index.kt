package com.ringcentral.paths.scim

class Index(val rc: com.ringcentral.RestClient, val version: String? = "v2") {


    fun path(withParameter: Boolean = true): String {
        if (withParameter && version != null) {
            return "/scim/${version}"
        }

        return "/scim"
    }


    fun health(): com.ringcentral.paths.scim.health.Index {
        return com.ringcentral.paths.scim.health.Index(this)
    }


    fun serviceproviderconfig(): com.ringcentral.paths.scim.serviceproviderconfig.Index {
        return com.ringcentral.paths.scim.serviceproviderconfig.Index(this)
    }


    @JvmOverloads
    fun users(id: String? = null): com.ringcentral.paths.scim.users.Index {
        return com.ringcentral.paths.scim.users.Index(this, id)
    }

}