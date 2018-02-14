package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipMentionsInfo
{
    // Id of the user
    public String id;
    public GlipMentionsInfo id(String id) {
        this.id = id;
        return this;
    }
    // Type of mentions
    public String type;
    public GlipMentionsInfo type(String type) {
        this.type = type;
        return this;
    }
    // Name of the user
    public String name;
    public GlipMentionsInfo name(String name) {
        this.name = name;
        return this;
    }
}
