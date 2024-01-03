package com.ringcentral.paths.analytics.calls.v1;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.analytics.calls.Index parent;

    public Index(com.ringcentral.paths.analytics.calls.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/v1";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.analytics.calls.v1.accounts.Index accounts() {
        return this.accounts(null);
    }

    public com.ringcentral.paths.analytics.calls.v1.accounts.Index accounts(String accountId) {
        return new com.ringcentral.paths.analytics.calls.v1.accounts.Index(this, accountId);
    }

}
