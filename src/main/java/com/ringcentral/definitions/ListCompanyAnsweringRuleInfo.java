package com.ringcentral.definitions;


public class ListCompanyAnsweringRuleInfo
{
    /**
     * Internal identifier of an answering rule
     */
    public String id;
    public ListCompanyAnsweringRuleInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of an answering rule
     */
    public String uri;
    public ListCompanyAnsweringRuleInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Specifies if the rule is active or inactive. The default value is &#039;True&#039;
     * Default: true
     */
    public Boolean enabled;
    public ListCompanyAnsweringRuleInfo enabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }

    /**
     * Type of an answering rule, the default value is &#039;Custom&#039; = [&#039;BusinessHours&#039;, &#039;AfterHours&#039;, &#039;Custom&#039;]
     * Enum: BusinessHours, AfterHours, Custom
     */
    public String type;
    public ListCompanyAnsweringRuleInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Name of an answering rule specified by user. Max number of symbols is 30. The default value is &#039;My Rule N&#039; where &#039;N&#039; is the first free number
     */
    public String name;
    public ListCompanyAnsweringRuleInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Answering rules are applied when calling to selected number(s)
     */
    public CalledNumberInfo[] calledNumbers;
    public ListCompanyAnsweringRuleInfo calledNumbers(CalledNumberInfo[] calledNumbers)
    {
        this.calledNumbers = calledNumbers;
        return this;
    }

    /**
     */
    public CompanyAnsweringRuleExtensionInfo extension;
    public ListCompanyAnsweringRuleInfo extension(CompanyAnsweringRuleExtensionInfo extension)
    {
        this.extension = extension;
        return this;
    }
}