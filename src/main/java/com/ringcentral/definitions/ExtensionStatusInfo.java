package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionStatusInfo
{
    // A free-form user comment, describing the status change reason
    public String comment;
    public ExtensionStatusInfo comment(String comment) {
        this.comment = comment;
        return this;
    }
    // Type of suspension
    public String reason;
    public ExtensionStatusInfo reason(String reason) {
        this.reason = reason;
        return this;
    }
}
