package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class MeetingLinks
{
    //
    public String startUri;
    public MeetingLinks startUri(String startUri) {
        this.startUri = startUri;
        return this;
    }
    //
    public String joinUri;
    public MeetingLinks joinUri(String joinUri) {
        this.joinUri = joinUri;
        return this;
    }
}
