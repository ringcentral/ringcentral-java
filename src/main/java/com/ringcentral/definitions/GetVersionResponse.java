package com.ringcentral.definitions;


public class GetVersionResponse {
    /**
     * Canonical URI of the version info resource
     */
    public String uri;
    /**
     * Version of the RingCentral REST API
     */
    public String versionString;
    /**
     * Release date of this version
     */
    public String releaseDate;
    /**
     * URI part determining the current version
     */
    public String uriString;

    public GetVersionResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetVersionResponse versionString(String versionString) {
        this.versionString = versionString;
        return this;
    }

    public GetVersionResponse releaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public GetVersionResponse uriString(String uriString) {
        this.uriString = uriString;
        return this;
    }

}
