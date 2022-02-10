package com.ringcentral.definitions;


/**
 * Query parameters for operation listAnsweringRules
 */
public class ListAnsweringRulesParameters {
    /**
     * Filters custom call handling rules of the extension
     * Enum: Custom
     */
    public String type;
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

    public ListAnsweringRulesParameters type(String type) {
        this.type = type;
        return this;
    }

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
