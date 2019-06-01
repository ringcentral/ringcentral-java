package com.ringcentral.definitions;


public class SIPInfoRequest {
    /**
     * Supported transport. SIP info will be returned for this transport if supported
     * Enum: UDP, TCP, TLS, WS, WSS
     */
    public String transport;

    public SIPInfoRequest transport(String transport) {
        this.transport = transport;
        return this;
    }

}
