package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ApiVersionResource
{
    //
    public String uri;
    public ApiVersionResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String versionString;
    public ApiVersionResource versionString(String versionString) {
        this.versionString = versionString;
        return this;
    }
    //
    public String releaseDate;
    public ApiVersionResource releaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }
    //
    public String uriString;
    public ApiVersionResource uriString(String uriString) {
        this.uriString = uriString;
        return this;
    }
}
