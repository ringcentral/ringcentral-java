package com.ringcentral.definitions;

public class GrantInfo {
    // Canonical URI of a grant
    public String uri;
    // Extension information
    public GrantInfo_ExtensionInfo extension;
    // Specifies if picking up of other extensions' calls is allowed for the extension. If 'Presence' feature is disabled for the given extension, the flag is not returned
    public Boolean callPickup;
    // Specifies if monitoring of other extensions' calls is allowed for the extension. If 'CallMonitoring' feature is disabled for the given extension, the flag is not returned
    public Boolean callMonitoring;
}
