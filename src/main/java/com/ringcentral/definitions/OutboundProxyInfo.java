package com.ringcentral.definitions;


public class OutboundProxyInfo {
    /**
     * Geographical region
     * Example: APAC
     */
    public String region;
    /**
     * SIP outbound proxy
     */
    public String proxy;
    /**
     * SIP details for TLS (Transport Layer Security)
     */
    public String proxyTLS;

    public OutboundProxyInfo region(String region) {
        this.region = region;
        return this;
    }

    public OutboundProxyInfo proxy(String proxy) {
        this.proxy = proxy;
        return this;
    }

    public OutboundProxyInfo proxyTLS(String proxyTLS) {
        this.proxyTLS = proxyTLS;
        return this;
    }
}
