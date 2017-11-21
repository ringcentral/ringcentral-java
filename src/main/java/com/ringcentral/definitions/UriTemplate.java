package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UriTemplate
{
    //
    public String template;
    public UriTemplate template(String template) {
        this.template = template;
        return this;
    }
    //
    public PatternWithGroups pattern;
    public UriTemplate pattern(PatternWithGroups pattern) {
        this.pattern = pattern;
        return this;
    }
    //
    public String[] templateVariables;
    public UriTemplate templateVariables(String[] templateVariables) {
        this.templateVariables = templateVariables;
        return this;
    }
    //
    public Long numberOfExplicitRegexes;
    public UriTemplate numberOfExplicitRegexes(Long numberOfExplicitRegexes) {
        this.numberOfExplicitRegexes = numberOfExplicitRegexes;
        return this;
    }
    //
    public Long numberOfRegexGroups;
    public UriTemplate numberOfRegexGroups(Long numberOfRegexGroups) {
        this.numberOfRegexGroups = numberOfRegexGroups;
        return this;
    }
    //
    public Long numberOfExplicitCharacters;
    public UriTemplate numberOfExplicitCharacters(Long numberOfExplicitCharacters) {
        this.numberOfExplicitCharacters = numberOfExplicitCharacters;
        return this;
    }
    //
    public Long numberOfTemplateVariables;
    public UriTemplate numberOfTemplateVariables(Long numberOfTemplateVariables) {
        this.numberOfTemplateVariables = numberOfTemplateVariables;
        return this;
    }
}
