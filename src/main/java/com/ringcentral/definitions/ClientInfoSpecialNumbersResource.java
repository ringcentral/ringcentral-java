package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ClientInfoSpecialNumbersResource
{
    //
    public String uri;
    public ClientInfoSpecialNumbersResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public ClientInfoSpecialNumberResource[] records;
    public ClientInfoSpecialNumbersResource records(ClientInfoSpecialNumberResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public ClientInfoSpecialNumbersResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public ClientInfoSpecialNumbersResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
