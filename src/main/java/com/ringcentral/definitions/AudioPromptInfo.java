package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AudioPromptInfo
{
    // Link to an prompt audio file
    public String uri;
    public AudioPromptInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Internal identifier of an prompt
    public String id;
    public AudioPromptInfo id(String id) {
        this.id = id;
        return this;
    }
}
