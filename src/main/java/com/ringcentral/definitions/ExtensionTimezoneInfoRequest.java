package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionTimezoneInfoRequest
{
    // internal Identifier for timezone
    public String id;
    public ExtensionTimezoneInfoRequest id(String id) {
        this.id = id;
        return this;
    }
}
