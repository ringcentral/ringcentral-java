package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipMessageAttachmentAuthorInfo
{
    // The author name
    public String name;
    public GlipMessageAttachmentAuthorInfo name(String name) {
        this.name = name;
        return this;
    }
    // Used to link the authors name
    public String uri;
    public GlipMessageAttachmentAuthorInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // A url to an image up to 82x82px that will display to the left of the author’s name
    public String iconUri;
    public GlipMessageAttachmentAuthorInfo iconUri(String iconUri) {
        this.iconUri = iconUri;
        return this;
    }
}
