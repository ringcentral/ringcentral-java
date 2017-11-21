package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class IncomingCallInformationResource
{
    //
    public String uri;
    public IncomingCallInformationResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String announcementWhenDirectCalls;
    public IncomingCallInformationResource announcementWhenDirectCalls(String announcementWhenDirectCalls) {
        this.announcementWhenDirectCalls = announcementWhenDirectCalls;
        return this;
    }
    //
    public String announcementWhenDepartmentCalls;
    public IncomingCallInformationResource announcementWhenDepartmentCalls(String announcementWhenDepartmentCalls) {
        this.announcementWhenDepartmentCalls = announcementWhenDepartmentCalls;
        return this;
    }
}
