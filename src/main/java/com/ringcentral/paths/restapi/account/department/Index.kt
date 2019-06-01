package com.ringcentral.paths.restapi.account.department

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val departmentId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && departmentId != null) {
            return "${parent.path()}/department/${departmentId}"
        }

        return "${parent.path()}/department"
    }


    fun bulkassign(): com.ringcentral.paths.restapi.account.department.bulkassign.Index {
        return com.ringcentral.paths.restapi.account.department.bulkassign.Index(this)
    }


    fun members(): com.ringcentral.paths.restapi.account.department.members.Index {
        return com.ringcentral.paths.restapi.account.department.members.Index(this)
    }

}