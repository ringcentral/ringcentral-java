package com.ringcentral.definitions;


public class ListCompanyAnsweringRuleInfo {
    /**
     * Internal identifier of an answering rule
     */
    public String id;
    /**
     * Canonical URI of an answering rule
     * Format: uri
     */
    public String uri;
    /**
     * Specifies if the rule is active or inactive. The default value is `true`
     * Default: true
     */
    public Boolean enabled;
    /**
     * Type of an answering rule, the default value is &#039;Custom&#039; = [&#039;BusinessHours&#039;, &#039;AfterHours&#039;, &#039;Custom&#039;]
     * Enum: BusinessHours, AfterHours, Custom
     */
    public String type;
    /**
     * Name of an answering rule specified by user. Max number of symbols is 30. The default value is &#039;My Rule N&#039; where &#039;N&#039; is the first free number
     */
    public String name;
    /**
     * Answering rules are applied when calling to selected number(s)
     */
    public CalledNumberInfo[] calledNumbers;
    /**
     *
     */
    public CompanyAnsweringRuleExtensionInfo extension;

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

    public ListCompanyAnsweringRuleInfo calledNumbers(CalledNumberInfo[] calledNumbers) {
        this.calledNumbers = calledNumbers;
        return this;
    }

    public ListCompanyAnsweringRuleInfo extension(CompanyAnsweringRuleExtensionInfo extension) {
        this.extension = extension;
        return this;
    }
}
