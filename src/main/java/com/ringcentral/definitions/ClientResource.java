package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ClientResource
{
    //
    public Boolean detected;
    public ClientResource detected(Boolean detected) {
        this.detected = detected;
        return this;
    }
    //
    public String userAgent;
    public ClientResource userAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }
    //
    public String appId;
    public ClientResource appId(String appId) {
        this.appId = appId;
        return this;
    }
    //
    public String appName;
    public ClientResource appName(String appName) {
        this.appName = appName;
        return this;
    }
    //
    public String appKey;
    public ClientResource appKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    //
    public String appVersion;
    public ClientResource appVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    //
    public String locale;
    public ClientResource locale(String locale) {
        this.locale = locale;
        return this;
    }
}
