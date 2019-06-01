package com.ringcentral.paths.restapi.account.directory

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/directory"
    }


    @JvmOverloads
    fun entries(entryId: String? = null): com.ringcentral.paths.restapi.account.directory.entries.Index {
        return com.ringcentral.paths.restapi.account.directory.entries.Index(this, entryId)
    }


    fun federation(): com.ringcentral.paths.restapi.account.directory.federation.Index {
        return com.ringcentral.paths.restapi.account.directory.federation.Index(this)
    }

}