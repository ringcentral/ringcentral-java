package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class NavigationInfo
{
    // Canonical URI for the first page of the list
    public String firstPage;
    public NavigationInfo firstPage(String firstPage) {
        this.firstPage = firstPage;
        return this;
    }
    // Canonical URI for the next page of the list
    public String nextPage;
    public NavigationInfo nextPage(String nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    // Canonical URI for the previous page of the list
    public String previousPage;
    public NavigationInfo previousPage(String previousPage) {
        this.previousPage = previousPage;
        return this;
    }
    // Canonical URI for the last page of the list
    public String lastPage;
    public NavigationInfo lastPage(String lastPage) {
        this.lastPage = lastPage;
        return this;
    }
}
