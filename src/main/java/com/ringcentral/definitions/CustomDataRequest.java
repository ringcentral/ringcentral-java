package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CustomDataRequest
{
    // Custom data access key. Optional. If specified, must match the custom key in the URL
    public String id;
    public CustomDataRequest id(String id) {
        this.id = id;
        return this;
    }
    // Description of custom data. Mandatory for create, if there is no attachment specified. Maximum length is limited to 256 symbols
    public String value;
    public CustomDataRequest value(String value) {
        this.value = value;
        return this;
    }
}
