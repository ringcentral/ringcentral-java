package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SIPInfoResponse
{
    // User credentials
    public String username;
    public SIPInfoResponse username(String username) {
        this.username = username;
        return this;
    }
    // User password
    public String password;
    public SIPInfoResponse password(String password) {
        this.password = password;
        return this;
    }
    // Identifier for SIP authorization
    public String authorizationId;
    public SIPInfoResponse authorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }
    // SIP domain
    public String domain;
    public SIPInfoResponse domain(String domain) {
        this.domain = domain;
        return this;
    }
    // SIP outbound proxy
    public String outboundProxy;
    public SIPInfoResponse outboundProxy(String outboundProxy) {
        this.outboundProxy = outboundProxy;
        return this;
    }
    // Preferred transport. SIP info will be returned for this transport if supported
    public String transport;
    public SIPInfoResponse transport(String transport) {
        this.transport = transport;
        return this;
    }
    // For TLS transport only Base64 encoded certificate
    public String certificate;
    public SIPInfoResponse certificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
}
