package com.ringcentral.definitions;


public class ListUserTemplatesParameters {
    /**
     * Enum: UserSettings, CallHandling
     */
    public String type;
    /**
     *
     */
    public String page;
    /**
     *
     */
    public String perPage;

    public ListUserTemplatesParameters type(String type) {
        this.type = type;
        return this;
    }

    public ListUserTemplatesParameters page(String page) {
        this.page = page;
        return this;
    }

    public ListUserTemplatesParameters perPage(String perPage) {
        this.perPage = perPage;
        return this;
    }

}
