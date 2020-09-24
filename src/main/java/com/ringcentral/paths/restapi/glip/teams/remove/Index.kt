package com.ringcentral.paths.restapi.glip.teams.remove

class Index(val parent: com.ringcentral.paths.restapi.glip.teams.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/remove"
    }

    /**
     * Operation: Remove Team Members
     * Http Post /restapi/v1.0/glip/teams/{chatId}/remove
     */
    fun post(glipPostMembersIdsListBody: com.ringcentral.definitions.GlipPostMembersIdsListBody): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), glipPostMembersIdsListBody)

        return rb.string()

    }

}
