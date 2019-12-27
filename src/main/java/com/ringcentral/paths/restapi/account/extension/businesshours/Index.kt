package com.ringcentral.paths.restapi.account.extension.businesshours

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/business-hours"
    }

    /**
     * Operation: Get User Business Hours
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/business-hours
     */
    fun get(): com.ringcentral.definitions.GetUserBusinessHoursResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GetUserBusinessHoursResponse::class.java)

    }


    /**
     * Operation: Update User Business Hours
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/business-hours
     */
    fun put(userBusinessHoursUpdateRequest: com.ringcentral.definitions.UserBusinessHoursUpdateRequest): com.ringcentral.definitions.UserBusinessHoursUpdateResponse? {
        val rb: okhttp3.ResponseBody = rc.put(this.path(), userBusinessHoursUpdateRequest)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.UserBusinessHoursUpdateResponse::class.java)

    }

}
