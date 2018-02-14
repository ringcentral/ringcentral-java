package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SiteInfo
{
    // Internal Identifier of a site
    public String id;
    public SiteInfo id(String id) {
        this.id = id;
        return this;
    }
    // custom name of a site
    public String name;
    public SiteInfo name(String name) {
        this.name = name;
        return this;
    }
}
