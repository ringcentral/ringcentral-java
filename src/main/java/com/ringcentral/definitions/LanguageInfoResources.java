package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class LanguageInfoResources
{
    //
    public String uri;
    public LanguageInfoResources uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public LanguageInfoResource[] records;
    public LanguageInfoResources records(LanguageInfoResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public LanguageInfoResources paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public LanguageInfoResources navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
