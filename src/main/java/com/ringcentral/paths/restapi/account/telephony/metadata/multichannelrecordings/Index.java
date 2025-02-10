package com.ringcentral.paths.restapi.account.telephony.metadata.multichannelrecordings;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.telephony.metadata.Index parent;
    public String metadataId;

    public Index(com.ringcentral.paths.restapi.account.telephony.metadata.Index parent, String metadataId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.metadataId = metadataId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && metadataId != null) {
            return parent.path() + "/multichannel-recordings/" + metadataId;
        }
        return parent.path() + "/multichannel-recordings";
    }

    public String path() {
        return path(true);
    }


    public com.ringcentral.paths.restapi.account.telephony.metadata.multichannelrecordings.content.Index content() {
        return new com.ringcentral.paths.restapi.account.telephony.metadata.multichannelrecordings.content.Index(this);
    }

}
