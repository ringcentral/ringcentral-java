package com.ringcentral.paths.ai.ringsense.v1.public1;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.ringsense.v1.Index parent;

    public Index(com.ringcentral.paths.ai.ringsense.v1.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/public";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.ai.ringsense.v1.public1.accounts.Index accounts() {
        return this.accounts(null);
    }

    public com.ringcentral.paths.ai.ringsense.v1.public1.accounts.Index accounts(String accountId) {
        return new com.ringcentral.paths.ai.ringsense.v1.public1.accounts.Index(this, accountId);
    }

}
