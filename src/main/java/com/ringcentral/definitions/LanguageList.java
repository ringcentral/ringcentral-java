package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class LanguageList
{
    // Canonical URI of the language list resource
    public String uri;
    public LanguageList uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Language data
    public LanguageInfo[] records;
    public LanguageList records(LanguageInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public LanguageList navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public LanguageList paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
