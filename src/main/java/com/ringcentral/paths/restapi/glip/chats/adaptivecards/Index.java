package com.ringcentral.paths.restapi.glip.chats.adaptivecards;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GlipAdaptiveCardRequest;
import com.ringcentral.definitions.GlipAdaptiveCardShortInfo;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.chats.Index parent;

    public Index(com.ringcentral.paths.restapi.glip.chats.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/adaptive-cards";
    }

    /**
     * Creates a new adaptive card in the chat specified in path.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/glip/chats/{chatId}/adaptive-cards
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public GlipAdaptiveCardShortInfo post(GlipAdaptiveCardRequest glipAdaptiveCardRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), glipAdaptiveCardRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipAdaptiveCardShortInfo.class);
    }
}
