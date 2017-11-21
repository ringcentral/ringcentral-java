package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SipInfo
{
    //
    public String transport;
    public SipInfo transport(String transport) {
        this.transport = transport;
        return this;
    }
    //
    public String certificate;
    public SipInfo certificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    //
    public String username;
    public SipInfo username(String username) {
        this.username = username;
        return this;
    }
    //
    public String password;
    public SipInfo password(String password) {
        this.password = password;
        return this;
    }
    //
    public String authorizationId;
    public SipInfo authorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }
    //
    public String domain;
    public SipInfo domain(String domain) {
        this.domain = domain;
        return this;
    }
    //
    public String outboundProxy;
    public SipInfo outboundProxy(String outboundProxy) {
        this.outboundProxy = outboundProxy;
        return this;
    }
    //
    public String wsProxy;
    public SipInfo wsProxy(String wsProxy) {
        this.wsProxy = wsProxy;
        return this;
    }
}
