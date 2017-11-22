package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class NavigationInfoURI
{
    //
    public String uri;
    public NavigationInfoURI uri(String uri) {
        this.uri = uri;
        return this;
    }
}
