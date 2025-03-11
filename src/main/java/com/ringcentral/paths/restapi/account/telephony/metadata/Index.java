package com.ringcentral.paths.restapi.account.telephony.metadata;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.telephony.Index parent;

    public Index(com.ringcentral.paths.restapi.account.telephony.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/metadata";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.restapi.account.telephony.metadata.multichannelrecordings.Index multichannelRecordings() {
        return this.multichannelRecordings(null);
    }

    public com.ringcentral.paths.restapi.account.telephony.metadata.multichannelrecordings.Index multichannelRecordings(String metadataId) {
        return new com.ringcentral.paths.restapi.account.telephony.metadata.multichannelrecordings.Index(this, metadataId);
    }

}
