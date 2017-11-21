package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SipInfoResource
{
    //
    public String uri;
    public SipInfoResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String domain;
    public SipInfoResource domain(String domain) {
        this.domain = domain;
        return this;
    }
    //
    public String outboundProxy;
    public SipInfoResource outboundProxy(String outboundProxy) {
        this.outboundProxy = outboundProxy;
        return this;
    }
    //
    public String userName;
    public SipInfoResource userName(String userName) {
        this.userName = userName;
        return this;
    }
    //
    public String password;
    public SipInfoResource password(String password) {
        this.password = password;
        return this;
    }
    //
    public String authorizationId;
    public SipInfoResource authorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }
}
