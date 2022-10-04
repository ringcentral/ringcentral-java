package com.ringcentral.definitions;


public class ApiVersionsList {
    /**
     * Canonical URI of the API version
     * Format: uri
     */
    public String uri;
    /**
     * Full API version information: uri, number, release date
     */
    public ApiVersionInfo[] apiVersions;
    /**
     * Server version
     */
    public String serverVersion;
    /**
     * Server revision
     */
    public String serverRevision;

    public ApiVersionsList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ApiVersionsList apiVersions(ApiVersionInfo[] apiVersions) {
        this.apiVersions = apiVersions;
        return this;
    }

    public ApiVersionsList serverVersion(String serverVersion) {
        this.serverVersion = serverVersion;
        return this;
    }

    public ApiVersionsList serverRevision(String serverRevision) {
        this.serverRevision = serverRevision;
        return this;
    }
}
