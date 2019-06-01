package com.ringcentral.paths.restapi.account.businesshours

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/business-hours"
    }

    /**
     * Operation: Get Company Business Hours
     * Http Get /restapi/v1.0/account/{accountId}/business-hours
     */
    fun get(): com.ringcentral.definitions.CompanyBusinessHours? {
        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.CompanyBusinessHours::class.java)

    }


    /**
     * Operation: Update Company Business Hours
     * Http Put /restapi/v1.0/account/{accountId}/business-hours
     */
    fun put(companyBusinessHoursUpdateRequest: com.ringcentral.definitions.CompanyBusinessHoursUpdateRequest): com.ringcentral.definitions.CompanyBusinessHours? {
        val rb: okhttp3.ResponseBody = rc.put(this.path(), companyBusinessHoursUpdateRequest)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.CompanyBusinessHours::class.java)

    }

}
