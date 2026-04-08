package com.ringcentral.definitions;

public class WsTokenResponse {
    /** The websocket access token to be used when connecting to the Websocket Gateway. Required */
    public String ws_access_token;

    public WsTokenResponse ws_access_token(String ws_access_token) {
        this.ws_access_token = ws_access_token;
        return this;
    }

    /** The URI of RingCentral Websocket Gateway. Format: uri */
    public String uri;

    public WsTokenResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** Websocket access token TTL (time-to-live) in seconds Required Format: int32 */
    public Long expires_in;

    public WsTokenResponse expires_in(Long expires_in) {
        this.expires_in = expires_in;
        return this;
    }
}
