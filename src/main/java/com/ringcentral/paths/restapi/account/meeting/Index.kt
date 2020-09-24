package com.ringcentral.paths.restapi.account.meeting

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/meeting"
    }


    fun lockedsettings(): com.ringcentral.paths.restapi.account.meeting.lockedsettings.Index {
        return com.ringcentral.paths.restapi.account.meeting.lockedsettings.Index(this)
    }

}
