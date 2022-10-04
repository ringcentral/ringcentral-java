package com.ringcentral.paths.restapi.glip.recent.chats;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GlipChatsListWithoutNavigation;
import com.ringcentral.definitions.ListRecentChatsParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.recent.Index parent;

    public Index(com.ringcentral.paths.restapi.glip.recent.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/chats";
    }

    /**
     * Returns recent chats where the user is a member. All records in response are sorted by the `lastModifiedTime` in descending order (the latest changed chat is displayed first on page). **Note** &#039;Chat&#039; is a general name for all types of threads including *Personal* (user&#039;s own me-chat), *Direct* (one on one chat), *Group* (chat of 3-15 participants without specific name), *Team* (chat of 2 and more participants, with a specific name), *Everyone* (company chat including all employees, with a specific name).&quot;
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/glip/recent/chats
     * Rate Limit Group: Light
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public GlipChatsListWithoutNavigation get(ListRecentChatsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipChatsListWithoutNavigation.class);
    }

    public GlipChatsListWithoutNavigation get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
