package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class MeetingsResource
{
    //
    public String uri;
    public MeetingsResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public MeetingResponseResource[] records;
    public MeetingsResource records(MeetingResponseResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public MeetingsResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public MeetingsResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
