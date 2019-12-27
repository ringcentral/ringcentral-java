package com.ringcentral.paths.restapi.account.pagingonlygroups.devices

class Index(val parent: com.ringcentral.paths.restapi.account.pagingonlygroups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/devices"
    }

    /**
     * Operation: Get Paging Group Devices
     * Http Get /restapi/v1.0/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/devices
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListPagingGroupDevicesParameters? = null): com.ringcentral.definitions.PagingOnlyGroupDevices? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.PagingOnlyGroupDevices::class.java)

    }

}
