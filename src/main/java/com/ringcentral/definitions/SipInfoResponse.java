package com.ringcentral.definitions;


public class SipInfoResponse {
    /**
     * User credentials
     */
    public String username;
    /**
     * User password
     * Format: password
     */
    public String password;
    /**
     * Supported authorization types and their priority for clients
     * Enum: SipDigest, BearerToken
     */
    public String[] authorizationTypes;
    /**
     * Identifier for SIP authorization
     */
    public String authorizationId;
    /**
     * SIP domain
     */
    public String domain;
    /**
     * SIP outbound proxy server address (in the format &lt;host:port&gt;)
     */
    public String outboundProxy;
    /**
     * SIP outbound IPv6 proxy server address (in the format &lt;host:port&gt;)
     */
    public String outboundProxyIPv6;
    /**
     * SIP outbound proxy server backup address (in the format &lt;host:port&gt;)
     */
    public String outboundProxyBackup;
    /**
     * SIP outbound IPv6 proxy server backup address (in the format &lt;host:port&gt;)
     */
    public String outboundProxyIPv6Backup;
    /**
     * Preferred transport. SIP info will be returned for this transport if supported
     * Enum: UDP, TCP, TLS, WSS
     */
    public String transport;
    /**
     * For TLS transport only, Base64 encoded certificate
     */
    public String certificate;
    /**
     * The interval in seconds after which the app must try to switch
     * back to primary proxy if it was previously switched to backup. If this
     * parameter is not returned, the app must stay on backup proxy and try to
     * switch to primary proxy after the next SIP-provision call.
     * Format: int32
     */
    public Long switchBackInterval;
    /**
     * List of stun servers in the format &lt;host:port&gt;
     */
    public String[] stunServers;

    public SipInfoResponse username(String username) {
        this.username = username;
        return this;
    }

    public SipInfoResponse password(String password) {
        this.password = password;
        return this;
    }

    public SipInfoResponse authorizationTypes(String[] authorizationTypes) {
        this.authorizationTypes = authorizationTypes;
        return this;
    }

    public SipInfoResponse authorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }

    public SipInfoResponse domain(String domain) {
        this.domain = domain;
        return this;
    }

    public SipInfoResponse outboundProxy(String outboundProxy) {
        this.outboundProxy = outboundProxy;
        return this;
    }

    public SipInfoResponse outboundProxyIPv6(String outboundProxyIPv6) {
        this.outboundProxyIPv6 = outboundProxyIPv6;
        return this;
    }

    public SipInfoResponse outboundProxyBackup(String outboundProxyBackup) {
        this.outboundProxyBackup = outboundProxyBackup;
        return this;
    }

    public SipInfoResponse outboundProxyIPv6Backup(String outboundProxyIPv6Backup) {
        this.outboundProxyIPv6Backup = outboundProxyIPv6Backup;
        return this;
    }

    public SipInfoResponse transport(String transport) {
        this.transport = transport;
        return this;
    }

    public SipInfoResponse certificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    public SipInfoResponse switchBackInterval(Long switchBackInterval) {
        this.switchBackInterval = switchBackInterval;
        return this;
    }

    public SipInfoResponse stunServers(String[] stunServers) {
        this.stunServers = stunServers;
        return this;
    }
}
