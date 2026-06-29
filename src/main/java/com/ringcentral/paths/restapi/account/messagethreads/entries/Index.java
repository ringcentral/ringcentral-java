package com.ringcentral.paths.restapi.account.messagethreads.entries;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.messagethreads.Index parent;

    public Index(com.ringcentral.paths.restapi.account.messagethreads.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/entries";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    public com.ringcentral.paths.restapi.account.messagethreads.entries.sync.Index sync() {
        return new com.ringcentral.paths.restapi.account.messagethreads.entries.sync.Index(this);
    }
}
