package com.ringcentral.paths.analytics.calls.v1.accounts;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.analytics.calls.v1.Index parent;
    public String accountId;

    public Index(com.ringcentral.paths.analytics.calls.v1.Index parent, String accountId) {
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


    public com.ringcentral.paths.analytics.calls.v1.accounts.timeline.Index timeline() {
        return new com.ringcentral.paths.analytics.calls.v1.accounts.timeline.Index(this);
    }


    public com.ringcentral.paths.analytics.calls.v1.accounts.aggregation.Index aggregation() {
        return new com.ringcentral.paths.analytics.calls.v1.accounts.aggregation.Index(this);
    }

}
