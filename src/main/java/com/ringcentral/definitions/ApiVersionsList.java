package com.ringcentral.definitions;


public class ApiVersionsList
{
    /**
     * Canonical URI of the API version
     * Format: uri
     */
    public String uri;
    public ApiVersionsList uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Full API version information: uri, number, release date
     */
    public ApiVersionInfo[] apiVersions;
    public ApiVersionsList apiVersions(ApiVersionInfo[] apiVersions)
    {
        this.apiVersions = apiVersions;
        return this;
    }

    /**
     * Server version
     */
    public String serverVersion;
    public ApiVersionsList serverVersion(String serverVersion)
    {
        this.serverVersion = serverVersion;
        return this;
    }

    /**
     * Server revision
     */
    public String serverRevision;
    public ApiVersionsList serverRevision(String serverRevision)
    {
        this.serverRevision = serverRevision;
        return this;
    }
}