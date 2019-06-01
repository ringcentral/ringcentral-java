package com.ringcentral.paths.restapi.account.extension.meetingsconfiguration

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/meetings-configuration"
    }


    fun assistants(): com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.assistants.Index {
        return com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.assistants.Index(this)
    }


    fun assisted(): com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.assisted.Index {
        return com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.assisted.Index(this)
    }

}