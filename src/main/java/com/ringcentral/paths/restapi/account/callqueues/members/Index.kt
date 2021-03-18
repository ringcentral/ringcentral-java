package com.ringcentral.paths.restapi.account.callqueues.members

class Index(val parent: com.ringcentral.paths.restapi.account.callqueues.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/members"
    }

    /**
     * Operation: Get Call Queue Members
     * Http Get /restapi/v1.0/account/{accountId}/call-queues/{groupId}/members
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListCallQueueMembersParameters? = null): com.ringcentral.definitions.CallQueueMembers? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.CallQueueMembers::class.java
        )

    }

}
