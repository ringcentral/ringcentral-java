package com.ringcentral.paths.restapi.clientinfo

class Index(val parent: com.ringcentral.paths.restapi.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/client-info"
    }


    fun sipprovision(): com.ringcentral.paths.restapi.clientinfo.sipprovision.Index {
        return com.ringcentral.paths.restapi.clientinfo.sipprovision.Index(this)
    }

}