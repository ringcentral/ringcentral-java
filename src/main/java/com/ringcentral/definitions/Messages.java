package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class Messages
{
    //
    public String uri;
    public Messages uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public MessageInfoResource[] records;
    public Messages records(MessageInfoResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public Messages paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public Messages navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
