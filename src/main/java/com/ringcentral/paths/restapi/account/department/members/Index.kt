package com.ringcentral.paths.restapi.account.department.members

class Index(val parent: com.ringcentral.paths.restapi.account.department.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/members"
    }

    /**
     * Operation: Get Department Member List
     * Http Get /restapi/v1.0/account/{accountId}/department/{departmentId}/members
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListDepartmentMembersParameters? = null): com.ringcentral.definitions.DepartmentMemberList? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.DepartmentMemberList::class.java)

    }

}
