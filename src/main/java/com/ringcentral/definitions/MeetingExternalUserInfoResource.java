package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class MeetingExternalUserInfoResource
{
    //
    public String uri;
    public MeetingExternalUserInfoResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String userId;
    public MeetingExternalUserInfoResource userId(String userId) {
        this.userId = userId;
        return this;
    }
    //
    public String accountId;
    public MeetingExternalUserInfoResource accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    //
    public Long userType;
    public MeetingExternalUserInfoResource userType(Long userType) {
        this.userType = userType;
        return this;
    }
    //
    public String userToken;
    public MeetingExternalUserInfoResource userToken(String userToken) {
        this.userToken = userToken;
        return this;
    }
}
