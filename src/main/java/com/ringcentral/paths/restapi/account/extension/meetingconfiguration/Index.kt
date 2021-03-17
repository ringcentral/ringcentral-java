package com.ringcentral.paths.restapi.account.extension.meetingconfiguration

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/meeting-configuration"
    }


    fun profileimage(): com.ringcentral.paths.restapi.account.extension.meetingconfiguration.profileimage.Index {
        return com.ringcentral.paths.restapi.account.extension.meetingconfiguration.profileimage.Index(this)
    }

}
