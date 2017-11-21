package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AcceptableMediaType
{
    //
    public String type;
    public AcceptableMediaType type(String type) {
        this.type = type;
        return this;
    }
    //
    public String subtype;
    public AcceptableMediaType subtype(String subtype) {
        this.subtype = subtype;
        return this;
    }
    //
    public Long quality;
    public AcceptableMediaType quality(Long quality) {
        this.quality = quality;
        return this;
    }
    //
    public Boolean wildcardType;
    public AcceptableMediaType wildcardType(Boolean wildcardType) {
        this.wildcardType = wildcardType;
        return this;
    }
    //
    public Boolean wildcardSubtype;
    public AcceptableMediaType wildcardSubtype(Boolean wildcardSubtype) {
        this.wildcardSubtype = wildcardSubtype;
        return this;
    }
}
