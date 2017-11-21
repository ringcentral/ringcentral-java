package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class OptionInfoReason
{
    // Internal code of the option disallowance reason
    public String id;
    public OptionInfoReason id(String id) {
        this.id = id;
        return this;
    }
    // Text description of the option disallowance reason
    public String message;
    public OptionInfoReason message(String message) {
        this.message = message;
        return this;
    }
}
