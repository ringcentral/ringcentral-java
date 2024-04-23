package com.ringcentral.paths.ai.text.v1.async.punctuate;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CaiAsyncApiResponse;
import com.ringcentral.definitions.CaiPunctuateParameters;
import com.ringcentral.definitions.PunctuateInput;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.text.v1.async.Index parent;

    public Index(com.ringcentral.paths.ai.text.v1.async.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/punctuate";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns Smart Punctuation to the provided webhook URI.
     * HTTP Method: post
     * Endpoint: /ai/text/v1/async/punctuate
     * Rate Limit Group: Heavy
     * App Permission: AI
     */
    public CaiAsyncApiResponse post(PunctuateInput punctuateInput, CaiPunctuateParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), punctuateInput, queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CaiAsyncApiResponse.class);
    }

    public CaiAsyncApiResponse post(PunctuateInput punctuateInput) throws com.ringcentral.RestException, java.io.IOException {
        return this.post(punctuateInput, null);
    }
}
