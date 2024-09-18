package com.ringcentral.definitions;


/**
 * Text and HTML formatted versions of the content body
 */
public class ContentBodyFormatted {
    /**
     *
     */
    public String html;
    /**
     *
     */
    public String text;

    public ContentBodyFormatted html(String html) {
        this.html = html;
        return this;
    }

    public ContentBodyFormatted text(String text) {
        this.text = text;
        return this;
    }
}
