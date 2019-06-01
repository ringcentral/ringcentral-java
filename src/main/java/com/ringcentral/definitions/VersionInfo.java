package com.ringcentral.definitions;


public class VersionInfo {
    /**
     * Canonical URI of API versions
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

    public VersionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public VersionInfo versionString(String versionString) {
        this.versionString = versionString;
        return this;
    }

    public VersionInfo releaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public VersionInfo uriString(String uriString) {
        this.uriString = uriString;
        return this;
    }

}
