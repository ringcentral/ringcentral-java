package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class HintResource
{
    //
    public Long expiresIn;
    public HintResource expiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
    //
    public Boolean actionRequired;
    public HintResource actionRequired(Boolean actionRequired) {
        this.actionRequired = actionRequired;
        return this;
    }
    //
    public String messageUri;
    public HintResource messageUri(String messageUri) {
        this.messageUri = messageUri;
        return this;
    }
}
