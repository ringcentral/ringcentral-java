package com.ringcentral.paths.ai.audio.v1.async.speakerdiarize;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CaiAsyncApiResponse;
import com.ringcentral.definitions.CaiSpeakerDiarizeParameters;
import com.ringcentral.definitions.DiarizeInput;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.audio.v1.async.Index parent;

    public Index(com.ringcentral.paths.ai.audio.v1.async.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/speaker-diarize";
    }

    /**
     * Returns Speaker Diarization to the provided webhook uri.
     * HTTP Method: post
     * Endpoint: /ai/audio/v1/async/speaker-diarize
     * Rate Limit Group: Heavy
     * App Permission: AI
     */
    public CaiAsyncApiResponse post(DiarizeInput diarizeInput, CaiSpeakerDiarizeParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), diarizeInput, queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CaiAsyncApiResponse.class);
    }

    public CaiAsyncApiResponse post(DiarizeInput diarizeInput) throws com.ringcentral.RestException, java.io.IOException {
        return this.post(diarizeInput, null);
    }
}
