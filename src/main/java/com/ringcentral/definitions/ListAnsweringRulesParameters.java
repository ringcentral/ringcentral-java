package com.ringcentral.definitions;


/**
 * Query parameters for operation listAnsweringRules
 */
public class ListAnsweringRulesParameters {
    /**
     * Type of an answering rule. Multiple values are supported
     * Enum: BusinessHours, AfterHours, Custom
     */
    public String[] type;
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
     * The result set page number (1-indexed) to return
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 1
     * Default: 1
     */
    public Long page;
    /**
     * The number of items per page. If provided value in the request
     * is greater than a maximum, the maximum value is applied
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 100
     * Default: 100
     */
    public Long perPage;

    public ListAnsweringRulesParameters type(String[] type) {
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

    public ListAnsweringRulesParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListAnsweringRulesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
