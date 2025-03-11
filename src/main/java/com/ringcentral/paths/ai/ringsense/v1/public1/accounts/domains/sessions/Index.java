package com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.sessions;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.Index parent;
    public String sourceSessionId;

    public Index(com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.Index parent, String sourceSessionId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.sourceSessionId = sourceSessionId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && sourceSessionId != null) {
            return parent.path() + "/sessions/" + sourceSessionId;
        }
        return parent.path() + "/sessions";
    }

    public String path() {
        return path(true);
    }


    public com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.sessions.insights.Index insights() {
        return new com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.sessions.insights.Index(this);
    }

}
