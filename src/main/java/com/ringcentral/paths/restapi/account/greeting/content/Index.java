package com.ringcentral.paths.restapi.account.greeting.content;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ReadAccountGreetingContentParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.greeting.Index parent;

    public Index(com.ringcentral.paths.restapi.account.greeting.Index parent) {
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
     * Returns account-level greeting media contents.
     * <p>
     * **This API must be called via media API entry point, e.g. https://media.ringcentral.com**
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/greeting/{greetingId}/content
     * Rate Limit Group: Heavy
     * App Permission: ReadAccounts
     */
    public byte[] get(ReadAccountGreetingContentParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return rb.bytes();
    }

    public byte[] get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
