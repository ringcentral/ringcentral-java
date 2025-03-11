package com.ringcentral.paths.restapi.account.telephony.metadata.multichannelrecordings.content;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.telephony.metadata.multichannelrecordings.Index parent;

    public Index(com.ringcentral.paths.restapi.account.telephony.metadata.multichannelrecordings.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/content";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns media content of a multichannel call recording
     * <p>
     * **This API must be called via media API entry point, e.g. https://media.ringcentral.com**
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/metadata/multichannel-recordings/{metadataId}/content
     * Rate Limit Group: Heavy
     * App Permission: ReadCallRecording
     */
    public String get(ReadMultichannelCallRecordingContentParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return rb.string();
    }

    public String get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
