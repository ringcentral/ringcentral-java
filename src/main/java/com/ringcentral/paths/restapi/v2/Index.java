package com.ringcentral.paths.restapi.v2;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.Index parent;

    public Index(com.ringcentral.paths.restapi.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/v2";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.restapi.v2.accounts.Index accounts() {
        return this.accounts("~");
    }

    public com.ringcentral.paths.restapi.v2.accounts.Index accounts(String accountId) {
        return new com.ringcentral.paths.restapi.v2.accounts.Index(this, accountId);
    }

}
