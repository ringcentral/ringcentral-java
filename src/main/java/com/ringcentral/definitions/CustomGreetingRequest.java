package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CustomGreetingRequest
{
    // Type of a greeting, specifying the case when the greeting is played. See Greeting Types = ['Introductory', 'Announcement', 'ConnectingMessage', 'ConnectingAudio', 'Voicemail', 'Unavailable', 'HoldMusic']
    public String type;
    public CustomGreetingRequest type(String type) {
        this.type = type;
        return this;
    }
    // nformation on an answering rule that the greeting is applied to
    public CustomGreetingAnsweringRuleInfoRequest answeringRule;
    public CustomGreetingRequest answeringRule(CustomGreetingAnsweringRuleInfoRequest answeringRule) {
        this.answeringRule = answeringRule;
        return this;
    }
}
