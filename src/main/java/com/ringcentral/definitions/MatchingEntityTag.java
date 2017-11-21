package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class MatchingEntityTag
{
    //
    public String value;
    public MatchingEntityTag value(String value) {
        this.value = value;
        return this;
    }
    //
    public Boolean weak;
    public MatchingEntityTag weak(Boolean weak) {
        this.weak = weak;
        return this;
    }
}
