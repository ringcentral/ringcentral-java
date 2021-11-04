package com.ringcentral.paths.restapi.glip.adaptivecards;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GlipAdaptiveCardInfo;
import com.ringcentral.definitions.GlipAdaptiveCardRequest;
import com.ringcentral.definitions.GlipAdaptiveCardShortInfo;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.Index parent;
    public String cardId;

    public Index(com.ringcentral.paths.restapi.glip.Index parent, String cardId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.cardId = cardId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && cardId != null) {
            return parent.path() + "/adaptive-cards/" + cardId;
        }
        return parent.path() + "/adaptive-cards";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns adaptive card(s) with given id(s).
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/glip/adaptive-cards/{cardId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: Glip
     */
    public GlipAdaptiveCardInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (cardId == null) {
            throw new IllegalArgumentException("Parameter cardId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipAdaptiveCardInfo.class);
    }

    /**
     * Updates an adaptive card.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/glip/adaptive-cards/{cardId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public GlipAdaptiveCardShortInfo put(GlipAdaptiveCardRequest glipAdaptiveCardRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (cardId == null) {
            throw new IllegalArgumentException("Parameter cardId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), glipAdaptiveCardRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipAdaptiveCardShortInfo.class);
    }

    /**
     * Deletes an adaptive card by ID.
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/glip/adaptive-cards/{cardId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (cardId == null) {
            throw new IllegalArgumentException("Parameter cardId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }
}
