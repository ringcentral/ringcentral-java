package com.ringcentral.definitions;


public class GlipUnreadMessageCountInfo {
    /**
     * Count of glip unread messages
     */
    public Long unread;

    public GlipUnreadMessageCountInfo unread(Long unread) {
        this.unread = unread;
        return this;
    }

}
