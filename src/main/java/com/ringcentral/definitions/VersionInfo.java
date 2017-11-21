package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class VersionInfo
{
    // Canonical URI of API versions
    public String uri;
    public VersionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Version of the RingCentral REST API
    public String versionString;
    public VersionInfo versionString(String versionString) {
        this.versionString = versionString;
        return this;
    }
    // Release date of this version
    public String releaseDate;
    public VersionInfo releaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }
    // URI part determining the current version
    public String uriString;
    public VersionInfo uriString(String uriString) {
        this.uriString = uriString;
        return this;
    }
}
