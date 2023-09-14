package com.ringcentral.paths.teammessaging.v1.chats.adaptivecards;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.v1.chats.Index parent;

    public Index(com.ringcentral.paths.teammessaging.v1.chats.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/adaptive-cards";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Creates a new adaptive card in the chat specified in path.
     * HTTP Method: post
     * Endpoint: /team-messaging/v1/chats/{chatId}/adaptive-cards
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public AdaptiveCardShortInfo post(AdaptiveCardRequest adaptiveCardRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), adaptiveCardRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AdaptiveCardShortInfo.class);
    }
}
