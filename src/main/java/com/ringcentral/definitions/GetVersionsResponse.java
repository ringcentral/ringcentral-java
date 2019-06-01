package com.ringcentral.definitions;


public class GetVersionsResponse {
    /**
     * Canonical URI of the API version
     */
    public String uri;
    /**
     * Full API version information: uri, number, release date
     */
    public VersionInfo[] apiVersions;
    /**
     * Server version
     */
    public String serverVersion;
    /**
     * Server revision
     */
    public String serverRevision;

    public GetVersionsResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetVersionsResponse apiVersions(VersionInfo[] apiVersions) {
        this.apiVersions = apiVersions;
        return this;
    }

    public GetVersionsResponse serverVersion(String serverVersion) {
        this.serverVersion = serverVersion;
        return this;
    }

    public GetVersionsResponse serverRevision(String serverRevision) {
        this.serverRevision = serverRevision;
        return this;
    }

}
