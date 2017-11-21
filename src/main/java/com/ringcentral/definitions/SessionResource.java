package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SessionResource
{
    //
    public String uri;
    public SessionResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public SessionResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String accountId;
    public SessionResource accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    //
    public String extensionId;
    public SessionResource extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
    //
    public String creationTime;
    public SessionResource creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    //
    public String clientId;
    public SessionResource clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    //
    public ApplicationResource application;
    public SessionResource application(ApplicationResource application) {
        this.application = application;
        return this;
    }
}
