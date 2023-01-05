package com.ringcentral.definitions;


public class SipInfoResource
{
    /**
     * SIP domain
     */
    public String domain;
    public SipInfoResource domain(String domain)
    {
        this.domain = domain;
        return this;
    }

    /**
     * List of outbound proxies
     */
    public OutboundProxyInfo[] outboundProxies;
    public SipInfoResource outboundProxies(OutboundProxyInfo[] outboundProxies)
    {
        this.outboundProxies = outboundProxies;
        return this;
    }

    /**
     * User credentials
     */
    public String userName;
    public SipInfoResource userName(String userName)
    {
        this.userName = userName;
        return this;
    }

    /**
     * User password
     */
    public String password;
    public SipInfoResource password(String password)
    {
        this.password = password;
        return this;
    }

    /**
     * Internal identifier for SIP authorization
     */
    public String authorizationId;
    public SipInfoResource authorizationId(String authorizationId)
    {
        this.authorizationId = authorizationId;
        return this;
    }
}