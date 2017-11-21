package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ApplicationInfoResource
{
    //
    public String clientId;
    public ApplicationInfoResource clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    //
    public ApplicationResource application;
    public ApplicationInfoResource application(ApplicationResource application) {
        this.application = application;
        return this;
    }
}
