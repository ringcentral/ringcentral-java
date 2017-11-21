package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CompanyDirectoryProfileImageInfo
{
    // Link to a profile image resource
    public String uri;
    public CompanyDirectoryProfileImageInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Internal identifier of an image
    public String etag;
    public CompanyDirectoryProfileImageInfo etag(String etag) {
        this.etag = etag;
        return this;
    }
}
