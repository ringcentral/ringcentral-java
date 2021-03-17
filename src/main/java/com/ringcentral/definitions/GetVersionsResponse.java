package com.ringcentral.definitions;


public class GetVersionsResponse
{
    /**
         * Canonical URI of the API version
         */
        public String uri;
  public GetVersionsResponse uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Full API version information: uri, number, release date
         */
        public VersionInfo[] apiVersions;
  public GetVersionsResponse apiVersions(VersionInfo[] apiVersions)
  {
    this.apiVersions = apiVersions;
    return this;
  }
  

        /**
         * Server version
         */
        public String serverVersion;
  public GetVersionsResponse serverVersion(String serverVersion)
  {
    this.serverVersion = serverVersion;
    return this;
  }
  

        /**
         * Server revision
         */
        public String serverRevision;
  public GetVersionsResponse serverRevision(String serverRevision)
  {
    this.serverRevision = serverRevision;
    return this;
  }
  
}
