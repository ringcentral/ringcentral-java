package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipUnreadMessageCountInfo
{
    // Count of glip unread messages
    public Long unread;
    public GlipUnreadMessageCountInfo unread(Long unread) {
        this.unread = unread;
        return this;
    }
}
