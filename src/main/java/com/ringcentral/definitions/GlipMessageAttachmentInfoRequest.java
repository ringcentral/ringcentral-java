package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipMessageAttachmentInfoRequest
{
    // Type of an attachment
    public String type;
    public GlipMessageAttachmentInfoRequest type(String type) {
        this.type = type;
        return this;
    }
    // A string of default text that will be rendered in the case that the client does not support Interactive Messages
    public String fallback;
    public GlipMessageAttachmentInfoRequest fallback(String fallback) {
        this.fallback = fallback;
        return this;
    }
    // A Hex color code that determines the color of the side border of the Interactive Message
    public String color;
    public GlipMessageAttachmentInfoRequest color(String color) {
        this.color = color;
        return this;
    }
    // A pretext to the message
    public String intro;
    public GlipMessageAttachmentInfoRequest intro(String intro) {
        this.intro = intro;
        return this;
    }
    // Information about the author
    public GlipMessageAttachmentAuthorInfo author;
    public GlipMessageAttachmentInfoRequest author(GlipMessageAttachmentAuthorInfo author) {
        this.author = author;
        return this;
    }
    // Message title
    public String title;
    public GlipMessageAttachmentInfoRequest title(String title) {
        this.title = title;
        return this;
    }
    // A large string field (up to 1000 chars) to be displayed as the body of a message (Supports GlipDown)
    public String text;
    public GlipMessageAttachmentInfoRequest text(String text) {
        this.text = text;
        return this;
    }
    // url used to display a single image at the bottom of a message
    public String imageUri;
    public GlipMessageAttachmentInfoRequest imageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    // url used to display a thumbnail to the right of a message (82x82)
    public String thumbnailUri;
    public GlipMessageAttachmentInfoRequest thumbnailUri(String thumbnailUri) {
        this.thumbnailUri = thumbnailUri;
        return this;
    }
    // Information on navigation
    public GlipMessageAttachmentFieldsInfo[] fields;
    public GlipMessageAttachmentInfoRequest fields(GlipMessageAttachmentFieldsInfo[] fields) {
        this.fields = fields;
        return this;
    }
    // Message Footer
    public GlipMessageAttachmentFootnoteInfo footnote;
    public GlipMessageAttachmentInfoRequest footnote(GlipMessageAttachmentFootnoteInfo footnote) {
        this.footnote = footnote;
        return this;
    }
}
