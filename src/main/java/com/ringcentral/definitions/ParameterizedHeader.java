package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ParameterizedHeader
{
    //
    public String value;
    public ParameterizedHeader value(String value) {
        this.value = value;
        return this;
    }
}
