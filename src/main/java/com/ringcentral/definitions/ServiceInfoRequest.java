package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ServiceInfoRequest
{
    // Limits which are effective for an account
    public AccountLimits limits;
    public ServiceInfoRequest limits(AccountLimits limits) {
        this.limits = limits;
        return this;
    }
}
