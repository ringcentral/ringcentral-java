package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PromptLanguageInfo
{
    // Link to prompt language
    public String uri;
    public PromptLanguageInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Internal identifier of an language
    public String id;
    public PromptLanguageInfo id(String id) {
        this.id = id;
        return this;
    }
    // Language name
    public String name;
    public PromptLanguageInfo name(String name) {
        this.name = name;
        return this;
    }
    // Language locale code
    public String localeCode;
    public PromptLanguageInfo localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }
}
