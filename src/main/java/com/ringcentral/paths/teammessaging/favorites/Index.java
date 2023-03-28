package com.ringcentral.paths.teammessaging.favorites;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ListFavoriteChatsNewParameters;
import com.ringcentral.definitions.TMChatListWithoutNavigation;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.Index parent;

    public Index(com.ringcentral.paths.teammessaging.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/favorites";
    }

    /**
     * Returns a list of the current user&#039;s favorite chats.
     * HTTP Method: get
     * Endpoint: /team-messaging/{version}/favorites
     * Rate Limit Group: Light
     * App Permission: TeamMessaging
     */
    public TMChatListWithoutNavigation get(ListFavoriteChatsNewParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMChatListWithoutNavigation.class);
    }

    public TMChatListWithoutNavigation get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
