package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class MediaType
{
    //
    public String type;
    public MediaType type(String type) {
        this.type = type;
        return this;
    }
    //
    public String subtype;
    public MediaType subtype(String subtype) {
        this.subtype = subtype;
        return this;
    }
    //
    public Boolean wildcardType;
    public MediaType wildcardType(Boolean wildcardType) {
        this.wildcardType = wildcardType;
        return this;
    }
    //
    public Boolean wildcardSubtype;
    public MediaType wildcardSubtype(Boolean wildcardSubtype) {
        this.wildcardSubtype = wildcardSubtype;
        return this;
    }
}
