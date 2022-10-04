package com.ringcentral.paths.restapi.glip.favorites;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GlipChatsListWithoutNavigation;
import com.ringcentral.definitions.ListFavoriteChatsParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.Index parent;

    public Index(com.ringcentral.paths.restapi.glip.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/favorites";
    }

    /**
     * Returns a list of the current user&#039;s favorite chats.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/glip/favorites
     * Rate Limit Group: Light
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public GlipChatsListWithoutNavigation get(ListFavoriteChatsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipChatsListWithoutNavigation.class);
    }

    public GlipChatsListWithoutNavigation get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
