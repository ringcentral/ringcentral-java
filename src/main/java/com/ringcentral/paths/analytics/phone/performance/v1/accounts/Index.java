package com.ringcentral.paths.analytics.phone.performance.v1.accounts;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.analytics.phone.performance.v1.Index parent;
    public String accountId;

    public Index(com.ringcentral.paths.analytics.phone.performance.v1.Index parent, String accountId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.accountId = accountId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && accountId != null) {
            return parent.path() + "/accounts/" + accountId;
        }
        return parent.path() + "/accounts";
    }

    public String path() {
        return path(true);
    }


    public com.ringcentral.paths.analytics.phone.performance.v1.accounts.calls.Index calls() {
        return new com.ringcentral.paths.analytics.phone.performance.v1.accounts.calls.Index(this);
    }

}
