package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AccountSignupInfoRequest
{
    //  Specifies whether marketing information is sent to the user
    public Boolean marketingAccepted;
    public AccountSignupInfoRequest marketingAccepted(Boolean marketingAccepted) {
        this.marketingAccepted = marketingAccepted;
        return this;
    }
}
