package com.ringcentral.definitions;


public class ListAnsweringRulesParameters {
    /**
     * Default: Simple
     * Enum: Detailed, Simple
     */
    public String view;
    /**
     * If true, then only active call handling rules are returned
     */
    public Boolean enabledOnly;
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

    public ListAnsweringRulesParameters enabledOnly(Boolean enabledOnly) {
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
