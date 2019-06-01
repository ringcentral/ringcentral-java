package com.ringcentral.definitions;


public class ListAnsweringRulesParameters {
    /**
     * Default: Simple
     */
    public String view;
    /**
     * Default: false
     */
    public String enabledOnly;
    /**
     * Default: 1
     */
    public String page;
    /**
     * Default: 100
     */
    public String perPage;

    public ListAnsweringRulesParameters view(String view) {
        this.view = view;
        return this;
    }

    public ListAnsweringRulesParameters enabledOnly(String enabledOnly) {
        this.enabledOnly = enabledOnly;
        return this;
    }

    public ListAnsweringRulesParameters page(String page) {
        this.page = page;
        return this;
    }

    public ListAnsweringRulesParameters perPage(String perPage) {
        this.perPage = perPage;
        return this;
    }

}
