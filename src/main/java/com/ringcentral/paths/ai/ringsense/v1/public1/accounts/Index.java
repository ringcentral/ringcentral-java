package com.ringcentral.paths.ai.ringsense.v1.public1.accounts;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.ringsense.v1.public1.Index parent;
    public String accountId;

    public Index(com.ringcentral.paths.ai.ringsense.v1.public1.Index parent, String accountId) {
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


    public com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.Index domains() {
        return this.domains(null);
    }

    public com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.Index domains(String domain) {
        return new com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.Index(this, domain);
    }

}
