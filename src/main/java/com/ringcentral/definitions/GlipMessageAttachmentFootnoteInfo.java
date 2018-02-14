package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipMessageAttachmentFootnoteInfo
{
    // A string used to be displayed as the body of the footer.
    public String text;
    public GlipMessageAttachmentFootnoteInfo text(String text) {
        this.text = text;
        return this;
    }
    // A URL used to display a 32x32px icon to the left of the footer
    public String iconUri;
    public GlipMessageAttachmentFootnoteInfo iconUri(String iconUri) {
        this.iconUri = iconUri;
        return this;
    }
    // A Unix timestamp to be displayed to the right of the footer (prettified)
    public String time;
    public GlipMessageAttachmentFootnoteInfo time(String time) {
        this.time = time;
        return this;
    }
}
