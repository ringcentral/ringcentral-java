package com.ringcentral.paths.ai.audio.v1.async.speechtotext;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AsrInput;
import com.ringcentral.definitions.CaiAsyncApiResponse;
import com.ringcentral.definitions.CaiSpeechToTextParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.audio.v1.async.Index parent;

    public Index(com.ringcentral.paths.ai.audio.v1.async.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/speech-to-text";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns Speech to Text Conversion to the provided webhook URI.
     * HTTP Method: post
     * Endpoint: /ai/audio/v1/async/speech-to-text
     * Rate Limit Group: Heavy
     * App Permission: AI
     */
    public CaiAsyncApiResponse post(AsrInput asrInput, CaiSpeechToTextParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), asrInput, queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CaiAsyncApiResponse.class);
    }

    public CaiAsyncApiResponse post(AsrInput asrInput) throws com.ringcentral.RestException, java.io.IOException {
        return this.post(asrInput, null);
    }
}
