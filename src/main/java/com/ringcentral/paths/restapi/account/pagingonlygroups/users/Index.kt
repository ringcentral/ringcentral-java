package com.ringcentral.paths.restapi.account.pagingonlygroups.users

class Index(val parent: com.ringcentral.paths.restapi.account.pagingonlygroups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/users"
    }

    /**
     * Operation: Get Paging Group Users
     * Http Get /restapi/v1.0/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/users
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListPagingGroupUsersParameters? = null): com.ringcentral.definitions.PagingOnlyGroupUsers? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.PagingOnlyGroupUsers::class.java
        )

    }

}
