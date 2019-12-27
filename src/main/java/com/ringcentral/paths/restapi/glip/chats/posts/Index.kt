package com.ringcentral.paths.restapi.glip.chats.posts

class Index(val parent: com.ringcentral.paths.restapi.glip.chats.Index, val postId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && postId != null) {
            return "${parent.path()}/posts/${postId}"
        }

        return "${parent.path()}/posts"
    }

    /**
     * Operation: Get Posts
     * Http Get /restapi/v1.0/glip/chats/{chatId}/posts
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ReadGlipPostsParameters? = null): com.ringcentral.definitions.GlipPostsList? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipPostsList::class.java)

    }


    /**
     * Operation: Create Post
     * Http Post /restapi/v1.0/glip/chats/{chatId}/posts
     */
    fun post(glipPostPostBody: com.ringcentral.definitions.GlipPostPostBody): com.ringcentral.definitions.GlipPostInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), glipPostPostBody)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipPostInfo::class.java)

    }


    /**
     * Operation: Get Post
     * Http Get /restapi/v1.0/glip/chats/{chatId}/posts/{postId}
     */
    fun get(): com.ringcentral.definitions.GlipPostInfo? {
        if (this.postId == null) {
            throw NullPointerException("postId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipPostInfo::class.java)

    }


    /**
     * Operation: Update Post
     * Http Patch /restapi/v1.0/glip/chats/{chatId}/posts/{postId}
     */
    fun patch(glipPatchPostBody: com.ringcentral.definitions.GlipPatchPostBody): com.ringcentral.definitions.GlipPostInfo? {
        if (this.postId == null) {
            throw NullPointerException("postId")
        }

        val rb: okhttp3.ResponseBody = rc.patch(this.path(), glipPatchPostBody)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipPostInfo::class.java)

    }


    /**
     * Operation: Delete Post
     * Http Delete /restapi/v1.0/glip/chats/{chatId}/posts/{postId}
     */
    fun delete(): String? {
        if (this.postId == null) {
            throw NullPointerException("postId")
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())

        return rb.string()

    }

}
