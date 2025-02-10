package com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.records;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.Index parent;
    public String sourceRecordId;

    public Index(com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.Index parent, String sourceRecordId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.sourceRecordId = sourceRecordId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && sourceRecordId != null) {
            return parent.path() + "/records/" + sourceRecordId;
        }
        return parent.path() + "/records";
    }

    public String path() {
        return path(true);
    }


    public com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.records.insights.Index insights() {
        return new com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.records.insights.Index(this);
    }

}
