package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CustomCompanyGreetingRequest
{
    // Type of a greeting, specifying the case when the greeting is played. See Greeting Types = ['Introductory', 'Announcement', 'ConnectingMessage', 'ConnectingAudio', 'Voicemail', 'Unavailable', 'HoldMusic']
    public String type;
    public CustomCompanyGreetingRequest type(String type) {
        this.type = type;
        return this;
    }
    // nformation on an answering rule that the greeting is applied to
    public CustomCompanyGreetingAnsweringRuleInfo answeringRule;
    public CustomCompanyGreetingRequest answeringRule(CustomCompanyGreetingAnsweringRuleInfo answeringRule) {
        this.answeringRule = answeringRule;
        return this;
    }
}
