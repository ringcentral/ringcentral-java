package com.ringcentral.paths.restapi.account.directory.entries.search

class Index(val parent: com.ringcentral.paths.restapi.account.directory.entries.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/search"
    }

    /**
     * Operation: Search Company Directory Entries
     * Http Post /restapi/v1.0/account/{accountId}/directory/entries/search
     */
    fun post(searchDirectoryEntriesRequest: com.ringcentral.definitions.SearchDirectoryEntriesRequest): com.ringcentral.definitions.DirectoryResource? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), searchDirectoryEntriesRequest)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.DirectoryResource::class.java)

    }

}
