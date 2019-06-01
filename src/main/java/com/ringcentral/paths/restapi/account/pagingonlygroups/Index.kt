package com.ringcentral.paths.restapi.account.pagingonlygroups

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val pagingOnlyGroupId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && pagingOnlyGroupId != null) {
            return "${parent.path()}/paging-only-groups/${pagingOnlyGroupId}"
        }

        return "${parent.path()}/paging-only-groups"
    }


    fun users(): com.ringcentral.paths.restapi.account.pagingonlygroups.users.Index {
        return com.ringcentral.paths.restapi.account.pagingonlygroups.users.Index(this)
    }


    fun devices(): com.ringcentral.paths.restapi.account.pagingonlygroups.devices.Index {
        return com.ringcentral.paths.restapi.account.pagingonlygroups.devices.Index(this)
    }


    fun bulkassign(): com.ringcentral.paths.restapi.account.pagingonlygroups.bulkassign.Index {
        return com.ringcentral.paths.restapi.account.pagingonlygroups.bulkassign.Index(this)
    }

}