package com.ringcentral.definitions;


public class SIPInfoResponse
{
    /**
         * User credentials
         */
        public String username;
  public SIPInfoResponse username(String username)
  {
    this.username = username;
    return this;
  }
  

        /**
         * User password
         */
        public String password;
  public SIPInfoResponse password(String password)
  {
    this.password = password;
    return this;
  }
  

        /**
         * Identifier for SIP authorization
         */
        public String authorizationId;
  public SIPInfoResponse authorizationId(String authorizationId)
  {
    this.authorizationId = authorizationId;
    return this;
  }
  

        /**
         * SIP domain
         */
        public String domain;
  public SIPInfoResponse domain(String domain)
  {
    this.domain = domain;
    return this;
  }
  

        /**
         * SIP outbound proxy
         */
        public String outboundProxy;
  public SIPInfoResponse outboundProxy(String outboundProxy)
  {
    this.outboundProxy = outboundProxy;
    return this;
  }
  

        /**
         * SIP outbound IPv6 proxy
         */
        public String outboundProxyIPv6;
  public SIPInfoResponse outboundProxyIPv6(String outboundProxyIPv6)
  {
    this.outboundProxyIPv6 = outboundProxyIPv6;
    return this;
  }
  

        /**
         * SIP outbound proxy backup
         */
        public String outboundProxyBackup;
  public SIPInfoResponse outboundProxyBackup(String outboundProxyBackup)
  {
    this.outboundProxyBackup = outboundProxyBackup;
    return this;
  }
  

        /**
         * SIP outbound IPv6 proxy backup
         */
        public String outboundProxyIPv6Backup;
  public SIPInfoResponse outboundProxyIPv6Backup(String outboundProxyIPv6Backup)
  {
    this.outboundProxyIPv6Backup = outboundProxyIPv6Backup;
    return this;
  }
  

        /**
         * Preferred transport. SIP info will be returned for this transport if supported
         * Enum: UDP, TCP, TLS, WS, WSS
         */
        public String transport;
  public SIPInfoResponse transport(String transport)
  {
    this.transport = transport;
    return this;
  }
  

        /**
         * For TLS transport only Base64 encoded certificate
         */
        public String certificate;
  public SIPInfoResponse certificate(String certificate)
  {
    this.certificate = certificate;
    return this;
  }
  

        /**
         * The interval in seconds after which the app must try to switch back to primary proxy if it was previously switched to backup. If this parameter is not returned, the app must stay on backup proxy and try to switch to primary proxy after the next SIP-provision call.
         */
        public Long switchBackInterval;
  public SIPInfoResponse switchBackInterval(Long switchBackInterval)
  {
    this.switchBackInterval = switchBackInterval;
    return this;
  }
  
}
