package com.ringcentral.definitions;


public class SIPInfoResponse {
    /**
     * User credentials
     */
    public String username;
    /**
     * User password
     */
    public String password;
    /**
     * Identifier for SIP authorization
     */
    public String authorizationId;
    /**
     * SIP domain
     */
    public String domain;
    /**
     * SIP outbound proxy
     */
    public String outboundProxy;
    /**
     * Preferred transport. SIP info will be returned for this transport if supported
     * Enum: UDP, TCP, TLS, WS, WSS
     */
    public String transport;
    /**
     * For TLS transport only Base64 encoded certificate
     */
    public String certificate;
    /**
     * The interval in seconds after which the app must try to switch back to primary proxy if it was previously switched to backup. If this parameter is not returned, the app must stay on backup proxy and try to switch to primary proxy after the next SIP-provision call.
     */
    public Long switchBackInterval;

    public SIPInfoResponse username(String username) {
        this.username = username;
        return this;
    }

    public SIPInfoResponse password(String password) {
        this.password = password;
        return this;
    }

    public SIPInfoResponse authorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }

    public SIPInfoResponse domain(String domain) {
        this.domain = domain;
        return this;
    }

    public SIPInfoResponse outboundProxy(String outboundProxy) {
        this.outboundProxy = outboundProxy;
        return this;
    }

    public SIPInfoResponse transport(String transport) {
        this.transport = transport;
        return this;
    }

    public SIPInfoResponse certificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    public SIPInfoResponse switchBackInterval(Long switchBackInterval) {
        this.switchBackInterval = switchBackInterval;
        return this;
    }

}
