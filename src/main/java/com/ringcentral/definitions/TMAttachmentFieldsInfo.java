package com.ringcentral.definitions;


public class TMAttachmentFieldsInfo {
    /**
     * Title of an individual field
     */
    public String title;
    /**
     * Value of an individual field (supports Markdown)
     */
    public String value;
    /**
     * Style of width span applied to a field
     * Default: Short
     * Enum: Short, Long
     */
    public String style;

    public TMAttachmentFieldsInfo title(String title) {
        this.title = title;
        return this;
    }

    public TMAttachmentFieldsInfo value(String value) {
        this.value = value;
        return this;
    }

    public TMAttachmentFieldsInfo style(String style) {
        this.style = style;
        return this;
    }
}
