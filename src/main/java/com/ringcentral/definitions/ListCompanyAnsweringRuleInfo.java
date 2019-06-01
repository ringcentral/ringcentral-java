package com.ringcentral.definitions;


public class ListCompanyAnsweringRuleInfo {
    /**
     * Internal identifier of an answering rule
     */
    public String id;
    /**
     * Canonical URI of an answering rule
     */
    public String uri;
    /**
     * Specifies if the rule is active or inactive. The default value is 'True'
     * Default: true
     */
    public Boolean enabled;
    /**
     * Type of an answering rule, the default value is 'Custom' = ['BusinessHours', 'AfterHours', 'Custom']
     * Enum: BusinessHours, AfterHours, Custom
     */
    public String type;
    /**
     * Name of an answering rule specified by user. Max number of symbols is 30. The default value is 'My Rule N' where 'N' is the first free number
     */
    public String name;

    public ListCompanyAnsweringRuleInfo id(String id) {
        this.id = id;
        return this;
    }

    public ListCompanyAnsweringRuleInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ListCompanyAnsweringRuleInfo enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public ListCompanyAnsweringRuleInfo type(String type) {
        this.type = type;
        return this;
    }

    public ListCompanyAnsweringRuleInfo name(String name) {
        this.name = name;
        return this;
    }

}
