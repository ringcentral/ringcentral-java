package com.ringcentral.paths.restapi.account.msteams;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;

    public Index(com.ringcentral.paths.restapi.account.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/ms-teams";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    public com.ringcentral.paths.restapi.account.msteams.directrouting.Index directRouting() {
        return new com.ringcentral.paths.restapi.account.msteams.directrouting.Index(this);
    }
}
