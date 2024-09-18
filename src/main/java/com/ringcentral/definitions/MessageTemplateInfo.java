package com.ringcentral.definitions;


/**
 * Text message template information
 */
public class MessageTemplateInfo {
    /**
     * Text of a message template. Maximum length is 1000 symbols (2-byte UTF-16 encoded)
     * Required
     */
    public String text;

    public MessageTemplateInfo text(String text) {
        this.text = text;
        return this;
    }
}
