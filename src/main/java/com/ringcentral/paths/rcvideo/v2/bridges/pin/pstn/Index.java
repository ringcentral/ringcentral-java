package com.ringcentral.paths.rcvideo.v2.bridges.pin.pstn;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.rcvideo.v2.bridges.pin.Index parent;
    public String pin;

    public Index(com.ringcentral.paths.rcvideo.v2.bridges.pin.Index parent, String pin) {
        this.parent = parent;
        this.rc = parent.rc;
        this.pin = pin;
    }

    public String path(Boolean withParameter) {
        if (withParameter && pin != null) {
            return parent.path() + "/pstn/" + pin;
        }
        return parent.path() + "/pstn";
    }

    public String path() {
        return path(true);
    }

    /**
     * Finds a bridge by Host or Participant PSTN PIN.
     * HTTP Method: get
     * Endpoint: /rcvideo/v2/bridges/pin/pstn/{pin}
     * Rate Limit Group: Medium
     * App Permission: Video
     */
    public BridgeResponse get(GetBridgeByPstnPinParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (pin == null) {
            throw new IllegalArgumentException("Parameter pin cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), BridgeResponse.class);
    }

    public BridgeResponse get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
