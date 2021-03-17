package com.ringcentral.paths.restapi.account.extension.emergencylocations

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/emergency-locations"
    }

    /**
     * Operation: Get User Emergency Location List
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/emergency-locations
     */
    fun get(): com.ringcentral.definitions.UserEmergencyLocationList? {
        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.UserEmergencyLocationList::class.java
        )

    }

}
