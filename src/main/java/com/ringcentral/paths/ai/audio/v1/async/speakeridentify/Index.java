package com.ringcentral.paths.ai.audio.v1.async.speakeridentify;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CaiAsyncApiResponse;
import com.ringcentral.definitions.CaiSpeakerIdentifyParameters;
import com.ringcentral.definitions.IdentifyInput;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.audio.v1.async.Index parent;

    public Index(com.ringcentral.paths.ai.audio.v1.async.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/speaker-identify";
    }

    /**
     * Returns Speaker Identification to the provided webhook uri.
     * HTTP Method: post
     * Endpoint: /ai/audio/v1/async/speaker-identify
     * Rate Limit Group: Heavy
     * App Permission: AI
     */
    public CaiAsyncApiResponse post(IdentifyInput identifyInput, CaiSpeakerIdentifyParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), identifyInput, queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CaiAsyncApiResponse.class);
    }

    public CaiAsyncApiResponse post(IdentifyInput identifyInput) throws com.ringcentral.RestException, java.io.IOException {
        return this.post(identifyInput, null);
    }
}
