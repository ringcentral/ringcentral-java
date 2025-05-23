package com.ringcentral.definitions;


/**
 * Query parameters for operation listVoiceInteractionRules
 */
public class ListVoiceInteractionRulesParameters {
    /**
     * Display only enabled rules
     */
    public Boolean enabled;
    /**
     * Display only rules with reference to state
     */
    public Boolean hasReference;
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

    public ListVoiceInteractionRulesParameters enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public ListVoiceInteractionRulesParameters hasReference(Boolean hasReference) {
        this.hasReference = hasReference;
        return this;
    }

    public ListVoiceInteractionRulesParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListVoiceInteractionRulesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
