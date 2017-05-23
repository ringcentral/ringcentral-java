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

    public ServerInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ServerInfo apiVersions(VersionInfo[] apiVersions) {
        this.apiVersions = apiVersions;
        return this;
    }

    public ServerInfo serverVersion(String serverVersion) {
        this.serverVersion = serverVersion;
        return this;
    }

    public ServerInfo serverRevision(String serverRevision) {
        this.serverRevision = serverRevision;
        return this;
    }
}
