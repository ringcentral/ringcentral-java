package com.ringcentral.paths.restapi.account.msteams.directrouting;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.msteams.Index parent;

    public Index(com.ringcentral.paths.restapi.account.msteams.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/direct-routing";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    public com.ringcentral.paths.restapi.account.msteams.directrouting.users.Index users() {
        return new com.ringcentral.paths.restapi.account.msteams.directrouting.users.Index(this);
    }
}
