package com.ringcentral.paths.restapi.glip.posts

class Index(val parent: com.ringcentral.paths.restapi.glip.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/posts"
    }

    /**
     * Operation: Get Posts
     * Http Get /restapi/v1.0/glip/posts
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListGlipPostsParameters? = null): com.ringcentral.definitions.GlipPosts? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipPosts::class.java)

    }


    /**
     * Operation: Create Post
     * Http Post /restapi/v1.0/glip/posts
     */
    fun post(glipCreatePost: com.ringcentral.definitions.GlipCreatePost): com.ringcentral.definitions.GlipPostInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), glipCreatePost)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipPostInfo::class.java)

    }

}
