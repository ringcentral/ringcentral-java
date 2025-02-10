package com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.ringsense.v1.public1.accounts.Index parent;
    public String domain;

    public Index(com.ringcentral.paths.ai.ringsense.v1.public1.accounts.Index parent, String domain) {
        this.parent = parent;
        this.rc = parent.rc;
        this.domain = domain;
    }

    public String path(Boolean withParameter) {
        if (withParameter && domain != null) {
            return parent.path() + "/domains/" + domain;
        }
        return parent.path() + "/domains";
    }

    public String path() {
        return path(true);
    }


    public com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.records.Index records() {
        return this.records(null);
    }

    public com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.records.Index records(String sourceRecordId) {
        return new com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.records.Index(this, sourceRecordId);
    }

}
