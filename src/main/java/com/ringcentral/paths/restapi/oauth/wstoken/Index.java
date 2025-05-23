package com.ringcentral.paths.restapi.oauth.wstoken;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.oauth.Index parent;

    public Index(com.ringcentral.paths.restapi.oauth.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/wstoken";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns a special short lived token to authorize a dedicated web socket connection between this client
     * and a backend.
     * <p>
     * This API needs to be called if a client plans to use &quot;Websocket&quot; transport to receive
     * RingCentral push notifications. The token returned by this API should be provided when establishing
     * a connection to the RingCentral Websocket Gateway.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/oauth/wstoken
     * Rate Limit Group: Auth
     * App Permission: WebSocket
     */
    public WsTokenResponse post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), WsTokenResponse.class);
    }
}
