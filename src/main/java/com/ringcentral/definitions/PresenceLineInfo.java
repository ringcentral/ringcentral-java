package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PresenceLineInfo
{
    //
    public String id;
    public PresenceLineInfo id(String id) {
        this.id = id;
        return this;
    }
    //
    public PresenceExtensionInfo extension;
    public PresenceLineInfo extension(PresenceExtensionInfo extension) {
        this.extension = extension;
        return this;
    }
}
