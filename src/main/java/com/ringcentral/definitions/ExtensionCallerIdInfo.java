package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionCallerIdInfo
{
    // Canonical URL of a caller ID resource
    public String uri;
    public ExtensionCallerIdInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public CallerIdByDevice[] byDevice;
    public ExtensionCallerIdInfo byDevice(CallerIdByDevice[] byDevice) {
        this.byDevice = byDevice;
        return this;
    }
    //
    public CallerIdByFeature[] byFeature;
    public ExtensionCallerIdInfo byFeature(CallerIdByFeature[] byFeature) {
        this.byFeature = byFeature;
        return this;
    }
}
