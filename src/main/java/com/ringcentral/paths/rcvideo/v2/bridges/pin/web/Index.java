package com.ringcentral.paths.rcvideo.v2.bridges.pin.web;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.BridgeResponse;
import com.ringcentral.definitions.GetBridgeByWebPinParameters;

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
            return parent.path() + "/web/" + pin;
        }
        return parent.path() + "/web";
    }

    public String path() {
        return path(true);
    }

    /**
     * Finds a bridge by short identifier (Web PIN). Also it can be used to find a default bridge by the alias
     * (personal meeting name).
     * <p>
     * HTTP Method: get
     * Endpoint: /rcvideo/v2/bridges/pin/web/{pin}
     * Rate Limit Group: Medium
     * App Permission: Video
     */
    public BridgeResponse get(GetBridgeByWebPinParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
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
