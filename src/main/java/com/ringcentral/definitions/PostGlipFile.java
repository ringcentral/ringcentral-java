package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PostGlipFile
{
    // Internal identifier of a file
    public String id;
    public PostGlipFile id(String id) {
        this.id = id;
        return this;
    }
    // Link to binary content
    public String contentUri;
    public PostGlipFile contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }
    // Name of a file
    public String name;
    public PostGlipFile name(String name) {
        this.name = name;
        return this;
    }
}
