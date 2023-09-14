package com.ringcentral.paths.ai.insights.v1.async.analyzeinteraction;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.insights.v1.async.Index parent;

    public Index(com.ringcentral.paths.ai.insights.v1.async.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/analyze-interaction";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns multiple insights including summaries, emotion, key phrases, questions asked, and more in a single API call.
     * <p>
     * HTTP Method: post
     * Endpoint: /ai/insights/v1/async/analyze-interaction
     * Rate Limit Group: Heavy
     * App Permission: AI
     */
    public CaiAsyncApiResponse post(InteractionInput interactionInput, CaiAnalyzeInteractionParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), interactionInput, queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CaiAsyncApiResponse.class);
    }

    public CaiAsyncApiResponse post(InteractionInput interactionInput) throws com.ringcentral.RestException, java.io.IOException {
        return this.post(interactionInput, null);
    }
}
