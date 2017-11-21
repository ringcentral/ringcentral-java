package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DevicesResource
{
    //
    public String uri;
    public DevicesResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public DeviceResource[] records;
    public DevicesResource records(DeviceResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public DevicesResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public DevicesResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
