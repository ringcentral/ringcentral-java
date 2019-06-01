package com.ringcentral.paths.restapi.glip.groups.posts

class Index(val parent: com.ringcentral.paths.restapi.glip.groups.Index, val postId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && postId != null) {
            return "${parent.path()}/posts/${postId}"
        }

        return "${parent.path()}/posts"
    }

    /**
     * Operation: Get Group Posts
     * Http Get /restapi/v1.0/glip/groups/{groupId}/posts
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListGlipGroupPostsParameters? = null): com.ringcentral.definitions.GlipPosts? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipPosts::class.java)

    }


    /**
     * Operation: Create Post in Group
     * Http Post /restapi/v1.0/glip/groups/{groupId}/posts
     */
    fun post(glipCreatePost: com.ringcentral.definitions.GlipCreatePost): com.ringcentral.definitions.GlipPostInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), glipCreatePost)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipPostInfo::class.java)

    }


    fun text(): com.ringcentral.paths.restapi.glip.groups.posts.text.Index {
        return com.ringcentral.paths.restapi.glip.groups.posts.text.Index(this)
    }

}