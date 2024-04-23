package com.ringcentral.paths.ai.text.v1.async.summarize;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CaiAsyncApiResponse;
import com.ringcentral.definitions.CaiSummarizeParameters;
import com.ringcentral.definitions.SummaryInput;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.text.v1.async.Index parent;

    public Index(com.ringcentral.paths.ai.text.v1.async.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/summarize";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns Conversational Summarization to the webhook URI for segmented transcript of audios
     * with start, end, speakerId, text(alphanumeric and punctuations).
     * <p>
     * HTTP Method: post
     * Endpoint: /ai/text/v1/async/summarize
     * Rate Limit Group: Heavy
     * App Permission: AI
     */
    public CaiAsyncApiResponse post(SummaryInput summaryInput, CaiSummarizeParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), summaryInput, queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CaiAsyncApiResponse.class);
    }

    public CaiAsyncApiResponse post(SummaryInput summaryInput) throws com.ringcentral.RestException, java.io.IOException {
        return this.post(summaryInput, null);
    }
}
