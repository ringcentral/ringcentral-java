package com.ringcentral.paths.restapi.numberporting

class Index(val parent: com.ringcentral.paths.restapi.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/number-porting"
    }


    fun verifynumber(): com.ringcentral.paths.restapi.numberporting.verifynumber.Index {
        return com.ringcentral.paths.restapi.numberporting.verifynumber.Index(this)
    }

}