package com.ringcentral.paths.restapi.glip.teams.add

class Index(val parent: com.ringcentral.paths.restapi.glip.teams.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/add"
    }

    /**
     * Operation: Add Team Members
     * Http Post /restapi/v1.0/glip/teams/{chatId}/add
     */
    fun post(glipPostMembersListBody: com.ringcentral.definitions.GlipPostMembersListBody): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), glipPostMembersListBody)

        return rb.string()

    }

}
