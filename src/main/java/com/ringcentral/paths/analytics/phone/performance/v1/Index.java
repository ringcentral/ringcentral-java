package com.ringcentral.paths.analytics.phone.performance.v1;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.analytics.phone.performance.Index parent;

    public Index(com.ringcentral.paths.analytics.phone.performance.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/v1";
    }


    public com.ringcentral.paths.analytics.phone.performance.v1.accounts.Index accounts() {
        return this.accounts(null);
    }

    public com.ringcentral.paths.analytics.phone.performance.v1.accounts.Index accounts(String accountId) {
        return new com.ringcentral.paths.analytics.phone.performance.v1.accounts.Index(this, accountId);
    }

}
