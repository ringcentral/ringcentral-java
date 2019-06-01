package com.ringcentral.definitions;


public class ListExtensionGrantsParameters {
    /**
     * Default: 1
     */
    public String page;
    /**
     * Default: 100
     */
    public String perPage;

    public ListExtensionGrantsParameters page(String page) {
        this.page = page;
        return this;
    }

    public ListExtensionGrantsParameters perPage(String perPage) {
        this.perPage = perPage;
        return this;
    }

}
