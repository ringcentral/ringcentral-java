package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CustomCompanyGreetingInfo
{
    // Link to an extension custom greeting
    public String uri;
    public CustomCompanyGreetingInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Internal identifier of an answering rule
    public String id;
    public CustomCompanyGreetingInfo id(String id) {
        this.id = id;
        return this;
    }
    // Internal identifier of an answering rule
    public String type;
    public CustomCompanyGreetingInfo type(String type) {
        this.type = type;
        return this;
    }
    // Content media type in WAV/MP3 format
    public String contentType;
    public CustomCompanyGreetingInfo contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    // Link to a greeting content (audio file)
    public String contentUri;
    public CustomCompanyGreetingInfo contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }
    // Information on an answering rule that the greeting is applied to
    public CustomGreetingAnsweringRuleInfo answeringRule;
    public CustomCompanyGreetingInfo answeringRule(CustomGreetingAnsweringRuleInfo answeringRule) {
        this.answeringRule = answeringRule;
        return this;
    }
}
