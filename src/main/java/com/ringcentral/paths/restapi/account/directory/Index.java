package com.ringcentral.paths.restapi.account.directory;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;

    public Index(com.ringcentral.paths.restapi.account.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/directory";
    }


    public com.ringcentral.paths.restapi.account.directory.entries.Index entries() {
        return this.entries(null);
    }

    public com.ringcentral.paths.restapi.account.directory.entries.Index entries(String entryId) {
        return new com.ringcentral.paths.restapi.account.directory.entries.Index(this, entryId);
    }


    public com.ringcentral.paths.restapi.account.directory.federation.Index federation() {
        return new com.ringcentral.paths.restapi.account.directory.federation.Index(this);
    }

}
