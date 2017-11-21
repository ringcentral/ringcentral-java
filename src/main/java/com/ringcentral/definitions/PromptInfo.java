package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PromptInfo
{
    // Internal identifier of a prompt
    public String uri;
    public PromptInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Link to a prompt metadata
    public String id;
    public PromptInfo id(String id) {
        this.id = id;
        return this;
    }
    // Type of a prompt media content
    public String contentType;
    public PromptInfo contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    // Link to a prompt media content
    public String contentUri;
    public PromptInfo contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }
    // Name of a prompt
    public String filename;
    public PromptInfo filename(String filename) {
        this.filename = filename;
        return this;
    }
}
