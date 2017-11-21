package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AcceptableLanguageTag
{
    //
    public String tag;
    public AcceptableLanguageTag tag(String tag) {
        this.tag = tag;
        return this;
    }
    //
    public String primaryTag;
    public AcceptableLanguageTag primaryTag(String primaryTag) {
        this.primaryTag = primaryTag;
        return this;
    }
    //
    public String subTags;
    public AcceptableLanguageTag subTags(String subTags) {
        this.subTags = subTags;
        return this;
    }
    //
    public Long quality;
    public AcceptableLanguageTag quality(Long quality) {
        this.quality = quality;
        return this;
    }
    //
    public Locale asLocale;
    public AcceptableLanguageTag asLocale(Locale asLocale) {
        this.asLocale = asLocale;
        return this;
    }
}
