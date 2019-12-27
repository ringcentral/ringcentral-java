package com.ringcentral.paths.restapi.account.ivrmenus

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val ivrMenuId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && ivrMenuId != null) {
            return "${parent.path()}/ivr-menus/${ivrMenuId}"
        }

        return "${parent.path()}/ivr-menus"
    }

    /**
     * Operation: Create IVR Menu
     * Http Post /restapi/v1.0/account/{accountId}/ivr-menus
     */
    fun post(iVRMenuInfo: com.ringcentral.definitions.IVRMenuInfo): com.ringcentral.definitions.IVRMenuInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), iVRMenuInfo)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.IVRMenuInfo::class.java)

    }


    /**
     * Operation: Get IVR Menu
     * Http Get /restapi/v1.0/account/{accountId}/ivr-menus/{ivrMenuId}
     */
    fun get(): com.ringcentral.definitions.IVRMenuInfo? {
        if (this.ivrMenuId == null) {
            throw NullPointerException("ivrMenuId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.IVRMenuInfo::class.java)

    }


    /**
     * Operation: Update IVR Menu
     * Http Put /restapi/v1.0/account/{accountId}/ivr-menus/{ivrMenuId}
     */
    fun put(iVRMenuInfo: com.ringcentral.definitions.IVRMenuInfo): com.ringcentral.definitions.IVRMenuInfo? {
        if (this.ivrMenuId == null) {
            throw NullPointerException("ivrMenuId")
        }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), iVRMenuInfo)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.IVRMenuInfo::class.java)

    }

}
