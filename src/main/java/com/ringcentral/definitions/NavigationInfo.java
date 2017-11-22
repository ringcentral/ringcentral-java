package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class NavigationInfo
{
    // Canonical URI for the first page of the list
    public NavigationInfoURI firstPage;
    public NavigationInfo firstPage(NavigationInfoURI firstPage) {
        this.firstPage = firstPage;
        return this;
    }
    // Canonical URI for the next page of the list
    public NavigationInfoURI nextPage;
    public NavigationInfo nextPage(NavigationInfoURI nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    // Canonical URI for the previous page of the list
    public NavigationInfoURI previousPage;
    public NavigationInfo previousPage(NavigationInfoURI previousPage) {
        this.previousPage = previousPage;
        return this;
    }
    // Canonical URI for the last page of the list
    public NavigationInfoURI lastPage;
    public NavigationInfo lastPage(NavigationInfoURI lastPage) {
        this.lastPage = lastPage;
        return this;
    }
}
