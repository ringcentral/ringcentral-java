package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipUnreadMessageCount
{
    // Total count of unread posts
    public Long unreadPostsCount;
    public GlipUnreadMessageCount unreadPostsCount(Long unreadPostsCount) {
        this.unreadPostsCount = unreadPostsCount;
        return this;
    }
    // 'True' if message quantity exceeds the threshold (100 by default)
    public Boolean tooManyUnreadPosts;
    public GlipUnreadMessageCount tooManyUnreadPosts(Boolean tooManyUnreadPosts) {
        this.tooManyUnreadPosts = tooManyUnreadPosts;
        return this;
    }
}
