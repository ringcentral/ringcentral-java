package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipMessageAttachmentFieldsInfo
{
    // Title for an individual field
    public String title;
    public GlipMessageAttachmentFieldsInfo title(String title) {
        this.title = title;
        return this;
    }
    // Field Value (Supports Markdown)
    public String value;
    public GlipMessageAttachmentFieldsInfo value(String value) {
        this.value = value;
        return this;
    }
    // A style used to flag fields that should span the width of the message, Defaults to 'Short' (Not full width)
    public String style;
    public GlipMessageAttachmentFieldsInfo style(String style) {
        this.style = style;
        return this;
    }
}
