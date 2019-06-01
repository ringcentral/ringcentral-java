package com.ringcentral.paths.restapi.numberparser

class Index(val parent: com.ringcentral.paths.restapi.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/number-parser"
    }


    fun parse(): com.ringcentral.paths.restapi.numberparser.parse.Index {
        return com.ringcentral.paths.restapi.numberparser.parse.Index(this)
    }

}