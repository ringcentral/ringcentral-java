package com.ringcentral.definitions;

public class NavigationInfo {
    // First page of the list
    public Page firstPage;
    // Next page of the list
    public Page nextPage;
    // Previous page of the list
    public Page previousPage;
    // Last page of the list
    public Page lastPage;

    public NavigationInfo firstPage(Page firstPage) {
        this.firstPage = firstPage;
        return this;
    }

    public NavigationInfo nextPage(Page nextPage) {
        this.nextPage = nextPage;
        return this;
    }

    public NavigationInfo previousPage(Page previousPage) {
        this.previousPage = previousPage;
        return this;
    }

    public NavigationInfo lastPage(Page lastPage) {
        this.lastPage = lastPage;
        return this;
    }
}
