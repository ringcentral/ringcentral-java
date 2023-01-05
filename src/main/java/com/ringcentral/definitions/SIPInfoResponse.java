package com.ringcentral.definitions;


public class SipInfoResponse
{
    /**
     * User credentials
     */
    public String username;
    public SipInfoResponse username(String username)
    {
        this.username = username;
        return this;
    }

    /**
     * User password
     * Format: password
     */
    public String password;
    public SipInfoResponse password(String password)
    {
        this.password = password;
        return this;
    }

    /**
     * Identifier for SIP authorization
     */
    public String authorizationId;
    public SipInfoResponse authorizationId(String authorizationId)
    {
        this.authorizationId = authorizationId;
        return this;
    }

    /**
     * SIP domain
     */
    public String domain;
    public SipInfoResponse domain(String domain)
    {
        this.domain = domain;
        return this;
    }

    /**
     * SIP outbound proxy server address (in the format &lt;host:port&gt;)
     */
    public String outboundProxy;
    public SipInfoResponse outboundProxy(String outboundProxy)
    {
        this.outboundProxy = outboundProxy;
        return this;
    }

    /**
     * SIP outbound IPv6 proxy server address (in the format &lt;host:port&gt;)
     */
    public String outboundProxyIPv6;
    public SipInfoResponse outboundProxyIPv6(String outboundProxyIPv6)
    {
        this.outboundProxyIPv6 = outboundProxyIPv6;
        return this;
    }

    /**
     * SIP outbound proxy server backup address (in the format &lt;host:port&gt;)
     */
    public String outboundProxyBackup;
    public SipInfoResponse outboundProxyBackup(String outboundProxyBackup)
    {
        this.outboundProxyBackup = outboundProxyBackup;
        return this;
    }

    /**
     * SIP outbound IPv6 proxy server backup address (in the format &lt;host:port&gt;)
     */
    public String outboundProxyIPv6Backup;
    public SipInfoResponse outboundProxyIPv6Backup(String outboundProxyIPv6Backup)
    {
        this.outboundProxyIPv6Backup = outboundProxyIPv6Backup;
        return this;
    }

    /**
     * Preferred transport. SIP info will be returned for this transport if supported
     * Enum: UDP, TCP, TLS, WS, WSS
     */
    public String transport;
    public SipInfoResponse transport(String transport)
    {
        this.transport = transport;
        return this;
    }

    /**
     * For TLS transport only, Base64 encoded certificate
     */
    public String certificate;
    public SipInfoResponse certificate(String certificate)
    {
        this.certificate = certificate;
        return this;
    }

    /**
     * The interval in seconds after which the app must try to switch
    * back to primary proxy if it was previously switched to backup. If this
    * parameter is not returned, the app must stay on backup proxy and try to
    * switch to primary proxy after the next SIP-provision call.
     * Format: int32
     */
    public Long switchBackInterval;
    public SipInfoResponse switchBackInterval(Long switchBackInterval)
    {
        this.switchBackInterval = switchBackInterval;
        return this;
    }

    /**
     * List of stun servers in the format &lt;host:port&gt;
     */
    public String[] stunServers;
    public SipInfoResponse stunServers(String[] stunServers)
    {
        this.stunServers = stunServers;
        return this;
    }
}