package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class Feature
{
    //
    public Boolean enabled;
    public Feature enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    //
    public Reason reason;
    public Feature reason(Reason reason) {
        this.reason = reason;
        return this;
    }
}
