package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class Reference
{
    //
    public String type;
    public Reference type(String type) {
        this.type = type;
        return this;
    }
    //
    public String ref;
    public Reference ref(String ref) {
        this.ref = ref;
        return this;
    }
}
