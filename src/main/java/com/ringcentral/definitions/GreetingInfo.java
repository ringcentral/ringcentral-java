package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GreetingInfo
{
    // Type of a greeting, specifying the case when the greeting is played. See Greeting Types = ['Introductory', 'Announcement', 'ConnectingMessage', 'ConnectingAudio', 'Voicemail', 'Unavailable', 'InterruptPrompt', 'HoldMusic']
    public String type;
    public GreetingInfo type(String type) {
        this.type = type;
        return this;
    }
    // Usage type of a greeting, specifying if the greeting is applied to user extension or department extension = ['UserExtensionAnsweringRule', 'ExtensionAnsweringRule DepartmentExtensionAnsweringRule']
    public String usageType;
    public GreetingInfo usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
    //
    public PresetInfo preset;
    public GreetingInfo preset(PresetInfo preset) {
        this.preset = preset;
        return this;
    }
}
