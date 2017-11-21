package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ClientApplicationInfo
{
    // 'True', if the server succeeded detecting application info, sufficient to return provisioning info
    public Boolean detected;
    public ClientApplicationInfo detected(Boolean detected) {
        this.detected = detected;
        return this;
    }
    // The value of 'User-Agent' header, as it was passed in request
    public String userAgent;
    public ClientApplicationInfo userAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }
    // Application identifier (from authorization session)
    public String appId;
    public ClientApplicationInfo appId(String appId) {
        this.appId = appId;
        return this;
    }
    // Application name (from authorization session, but must match 'User-Agent')
    public String appName;
    public ClientApplicationInfo appName(String appName) {
        this.appName = appName;
        return this;
    }
    // Application version (parsed from 'User-Agent')
    public String appVersion;
    public ClientApplicationInfo appVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    // Application platform operation system (parsed from 'User-Agent': Windows, MacOS, Android, iOS
    public String appPlatform;
    public ClientApplicationInfo appPlatform(String appPlatform) {
        this.appPlatform = appPlatform;
        return this;
    }
    // Application platform operation system version (parsed from 'User-Agent')
    public String appPlatformVersion;
    public ClientApplicationInfo appPlatformVersion(String appPlatformVersion) {
        this.appPlatformVersion = appPlatformVersion;
        return this;
    }
    // Locale, parsed from 'Accept-Language'. Currently en-GB and en-US locales are supported. The default value is en-US
    public String locale;
    public ClientApplicationInfo locale(String locale) {
        this.locale = locale;
        return this;
    }
}
