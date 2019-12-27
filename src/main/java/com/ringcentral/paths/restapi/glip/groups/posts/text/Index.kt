package com.ringcentral.paths.restapi.glip.groups.posts.text

class Index(val parent: com.ringcentral.paths.restapi.glip.groups.posts.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/text"
    }

    /**
     * Operation: Update Post
     * Http Put /restapi/v1.0/glip/groups/{groupId}/posts/{postId}/text
     */
    fun put(body: String): String? {
        val rb: okhttp3.ResponseBody = rc.put(this.path(), body)

        return rb.string()

    }

}
