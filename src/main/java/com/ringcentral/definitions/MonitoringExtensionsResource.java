package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class MonitoringExtensionsResource
{
    //
    public String uri;
    public MonitoringExtensionsResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public MonitoringExtensionResource[] records;
    public MonitoringExtensionsResource records(MonitoringExtensionResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public MonitoringExtensionsResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public MonitoringExtensionsResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
