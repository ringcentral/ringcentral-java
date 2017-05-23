package com.ringcentral.definitions;

public class ServerInfo {
    // Canonical URI of the API version
    public String uri;
    // Full API version information: uri, number, release date
    public VersionInfo[] apiVersions;
    // Server version
    public String serverVersion;
    // Server revision
    public String serverRevision;
}
