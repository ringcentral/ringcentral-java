package com.ringcentral.definitions;


public class OutboundProxyInfo
{
    /**
     * Geographical region
     * Example: APAC
     */
    public String region;
    public OutboundProxyInfo region(String region)
    {
        this.region = region;
        return this;
    }

    /**
     * SIP outbound proxy
     */
    public String proxy;
    public OutboundProxyInfo proxy(String proxy)
    {
        this.proxy = proxy;
        return this;
    }

    /**
     * SIP details for TLS (Transport Layer Security)
     */
    public String proxyTLS;
    public OutboundProxyInfo proxyTLS(String proxyTLS)
    {
        this.proxyTLS = proxyTLS;
        return this;
    }
}