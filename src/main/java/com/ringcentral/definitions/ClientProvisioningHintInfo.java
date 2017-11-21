package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ClientProvisioningHintInfo
{
    // Seconds until expiration date. Returned only if applicable
    public Long expiresIn;
    public ClientProvisioningHintInfo expiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
    // 'False', if the value of expiresIn is greater than 0 (zero), otherwise - 'True'
    public Boolean actionRequired;
    public ClientProvisioningHintInfo actionRequired(Boolean actionRequired) {
        this.actionRequired = actionRequired;
        return this;
    }
}
