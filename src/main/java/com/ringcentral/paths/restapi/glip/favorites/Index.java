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
     * Returns a list of the current user&#039;s favorite chats. **Note** &#039;Chat&#039; is a general name for all types of threads icluding *Personal* (user&#039;s own me-chat), *Direct* (one on one chat), *Group* (chat of 3-15 participants without specific name), *Team* (chat of 2 and more participants, with a specific name), *Everyone* (company chat including all employees, with a specific name).&quot;
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/glip/favorites
     * Rate Limit Group: Light
     * App Permission: Glip
     * User Permission: Glip
     */
    public GlipChatsListWithoutNavigation get(ListFavoriteChatsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipChatsListWithoutNavigation.class);
    }

    public GlipChatsListWithoutNavigation get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
