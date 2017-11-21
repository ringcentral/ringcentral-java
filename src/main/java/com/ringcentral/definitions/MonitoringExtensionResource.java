package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class MonitoringExtensionResource
{
    //
    public String uri;
    public MonitoringExtensionResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public MonitoringExtensionResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String extensionNumber;
    public MonitoringExtensionResource extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
