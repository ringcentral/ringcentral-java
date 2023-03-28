package com.ringcentral.definitions;


public class SipInfoResource {
    /**
     * SIP domain
     */
    public String domain;
    /**
     * List of outbound proxies
     */
    public OutboundProxyInfo[] outboundProxies;
    /**
     * User credentials
     */
    public String userName;
    /**
     * User password
     */
    public String password;
    /**
     * Internal identifier for SIP authorization
     */
    public String authorizationId;

    public SipInfoResource domain(String domain) {
        this.domain = domain;
        return this;
    }

    public SipInfoResource outboundProxies(OutboundProxyInfo[] outboundProxies) {
        this.outboundProxies = outboundProxies;
        return this;
    }

    public SipInfoResource userName(String userName) {
        this.userName = userName;
        return this;
    }

    public SipInfoResource password(String password) {
        this.password = password;
        return this;
    }

    public SipInfoResource authorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }
}
