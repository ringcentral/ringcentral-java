package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AddonInfo
{
    //
    public String id;
    public AddonInfo id(String id) {
        this.id = id;
        return this;
    }
    //
    public String count;
    public AddonInfo count(String count) {
        this.count = count;
        return this;
    }
}
