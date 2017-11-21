package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class StatusType
{
    //
    public String family;
    public StatusType family(String family) {
        this.family = family;
        return this;
    }
    //
    public Long statusCode;
    public StatusType statusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    //
    public String reasonPhrase;
    public StatusType reasonPhrase(String reasonPhrase) {
        this.reasonPhrase = reasonPhrase;
        return this;
    }
}
