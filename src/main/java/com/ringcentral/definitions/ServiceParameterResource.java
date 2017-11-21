package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ServiceParameterResource
{
    //
    public String id;
    public ServiceParameterResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String value;
    public ServiceParameterResource value(String value) {
        this.value = value;
        return this;
    }
    //
    public String accountId;
    public ServiceParameterResource accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
}
