package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AccessValidationResource
{
    //
    public String uri;
    public AccessValidationResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String applicationId;
    public AccessValidationResource applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    //
    public String endpointId;
    public AccessValidationResource endpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    //
    public String sessionId;
    public AccessValidationResource sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    //
    public String credentialType;
    public AccessValidationResource credentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }
    //
    public String[] scope;
    public AccessValidationResource scope(String[] scope) {
        this.scope = scope;
        return this;
    }
    //
    public String accountId;
    public AccessValidationResource accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    //
    public String extensionId;
    public AccessValidationResource extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
    //
    public String brandId;
    public AccessValidationResource brandId(String brandId) {
        this.brandId = brandId;
        return this;
    }
    //
    public String tierId;
    public AccessValidationResource tierId(String tierId) {
        this.tierId = tierId;
        return this;
    }
}
