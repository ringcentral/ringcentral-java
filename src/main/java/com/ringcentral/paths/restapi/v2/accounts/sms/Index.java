package com.ringcentral.paths.restapi.v2.accounts.sms;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/sms";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.restapi.v2.accounts.sms.optouts.Index optOuts() {
        return new com.ringcentral.paths.restapi.v2.accounts.sms.optouts.Index(this);
    }

}
