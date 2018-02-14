package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PhotoInfo
{
    //
    public String value;
    public PhotoInfo value(String value) {
        this.value = value;
        return this;
    }
    //
    public String type;
    public PhotoInfo type(String type) {
        this.type = type;
        return this;
    }
}
