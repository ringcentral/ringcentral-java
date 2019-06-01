package com.ringcentral.paths.restapi.account.directory.entries

class Index(val parent: com.ringcentral.paths.restapi.account.directory.Index, val entryId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && entryId != null) {
            return "${parent.path()}/entries/${entryId}"
        }

        return "${parent.path()}/entries"
    }

    /**
     * Operation: Get Company Directory Entries
     * Http Get /restapi/v1.0/account/{accountId}/directory/entries
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListDirectoryEntriesParameters? = null): com.ringcentral.definitions.DirectoryResource? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.DirectoryResource::class.java)

    }


    /**
     * Operation: Get Corporate Directory Entry
     * Http Get /restapi/v1.0/account/{accountId}/directory/entries/{entryId}
     */
    fun get(): com.ringcentral.definitions.ContactResource? {
        if (this.entryId == null) {
            throw NullPointerException("entryId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.ContactResource::class.java)

    }


    fun search(): com.ringcentral.paths.restapi.account.directory.entries.search.Index {
        return com.ringcentral.paths.restapi.account.directory.entries.search.Index(this)
    }

}