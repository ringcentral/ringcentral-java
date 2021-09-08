package com.ringcentral.paths.restapi.glip.everyone;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GlipEveryoneInfo;
import com.ringcentral.definitions.UpdateGlipEveryoneRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.Index parent;

    public Index(com.ringcentral.paths.restapi.glip.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/everyone";
    }

    /**
     * Returns information about Everyone chat, which is a company level chat including all employees; assigned with specific name.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/glip/everyone
     * Rate Limit Group: Light
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public GlipEveryoneInfo get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipEveryoneInfo.class);
    }

    /**
     * Updates Everyone chat information. Everyone chat is a company level chat including all employees; assigned with specific name.
     * HTTP Method: patch
     * Endpoint: /restapi/{apiVersion}/glip/everyone
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public GlipEveryoneInfo patch(UpdateGlipEveryoneRequest updateGlipEveryoneRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), updateGlipEveryoneRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipEveryoneInfo.class);
    }
}
