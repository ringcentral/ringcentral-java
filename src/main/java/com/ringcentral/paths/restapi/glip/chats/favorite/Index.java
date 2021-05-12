package com.ringcentral.paths.restapi.glip.chats.favorite;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.chats.Index parent;

    public Index(com.ringcentral.paths.restapi.glip.chats.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/favorite";
    }

    /**
     * Adds the specified chat to the users&#039;s list of favorites. **Note** &#039;Chat&#039; is a general name for all types of threads icluding *Personal* (user&#039;s own me-chat), *Direct* (one on one chat), *Group* (chat of 3-15 participants without specific name), *Team* (chat of 2 and more participants, with a specific name), *Everyone* (company chat including all employees, with a specific name).&quot;
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/glip/chats/{chatId}/favorite
     * Rate Limit Group: Medium
     * App Permission: Glip
     * User Permission: Glip
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return rb.string();
    }
}
