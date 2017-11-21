package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GrantInfo
{
    // Canonical URI of a grant
    public String uri;
    public GrantInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Extension information
    public ExtensionInfoGrants extension;
    public GrantInfo extension(ExtensionInfoGrants extension) {
        this.extension = extension;
        return this;
    }
    // Specifies if picking up of other extensions' calls is allowed for the extension. If 'Presence' feature is disabled for the given extension, the flag is not returned
    public Boolean callPickup;
    public GrantInfo callPickup(Boolean callPickup) {
        this.callPickup = callPickup;
        return this;
    }
    // Specifies if monitoring of other extensions' calls is allowed for the extension. If 'CallMonitoring' feature is disabled for the given extension, the flag is not returned
    public Boolean callMonitoring;
    public GrantInfo callMonitoring(Boolean callMonitoring) {
        this.callMonitoring = callMonitoring;
        return this;
    }
}
