package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ProfileImageInfoURI
{
    //
    public String uri;
    public ProfileImageInfoURI uri(String uri) {
        this.uri = uri;
        return this;
    }
}
