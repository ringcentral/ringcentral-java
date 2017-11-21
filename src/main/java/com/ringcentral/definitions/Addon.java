package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class Addon
{
    //
    public String id;
    public Addon id(String id) {
        this.id = id;
        return this;
    }
    //
    public String name;
    public Addon name(String name) {
        this.name = name;
        return this;
    }
    //
    public Long count;
    public Addon count(Long count) {
        this.count = count;
        return this;
    }
}
