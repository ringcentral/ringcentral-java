package com.ringcentral.paths.restapi.glip.groups.posts

class Index(val parent: com.ringcentral.paths.restapi.glip.groups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/posts"
    }

    /**
     * Operation: Create Post in Group
     * Http Post /restapi/v1.0/glip/groups/{groupId}/posts
     */
    fun post(glipCreatePost: com.ringcentral.definitions.GlipCreatePost): com.ringcentral.definitions.GlipPostInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), glipCreatePost)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.GlipPostInfo::class.java)

    }

}
