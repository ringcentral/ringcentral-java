package com.ringcentral.paths.restapi.account.ivrprompts.content;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.ivrprompts.Index parent;

    public Index(com.ringcentral.paths.restapi.account.ivrprompts.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/content";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns media content of an IVR prompt by ID.
     * <p>
     * **This API must be called via media API entry point, e.g. https://media.ringcentral.com**
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/ivr-prompts/{promptId}/content
     * Rate Limit Group: Heavy
     * App Permission: ReadAccounts
     */
    public byte[] get(ReadIVRPromptContentParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return rb.bytes();
    }

    public byte[] get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
