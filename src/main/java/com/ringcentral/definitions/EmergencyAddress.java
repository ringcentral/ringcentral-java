package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class EmergencyAddress
{
    //  'True' if specifying of emergency address is required
    public Boolean required;
    public EmergencyAddress required(Boolean required) {
        this.required = required;
        return this;
    }
    //  'True' if only local emergency address can be specified
    public Boolean localOnly;
    public EmergencyAddress localOnly(Boolean localOnly) {
        this.localOnly = localOnly;
        return this;
    }
}
