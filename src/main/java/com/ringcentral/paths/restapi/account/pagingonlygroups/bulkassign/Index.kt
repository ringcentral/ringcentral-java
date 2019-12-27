package com.ringcentral.paths.restapi.account.pagingonlygroups.bulkassign

class Index(val parent: com.ringcentral.paths.restapi.account.pagingonlygroups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/bulk-assign"
    }

    /**
     * Operation: Assign Paging Group Users and Devices
     * Http Post /restapi/v1.0/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/bulk-assign
     */
    fun post(editPagingGroupRequest: com.ringcentral.definitions.EditPagingGroupRequest): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), editPagingGroupRequest)

        return rb.string()

    }

}
