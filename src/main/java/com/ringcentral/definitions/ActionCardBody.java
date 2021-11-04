package com.ringcentral.definitions;


public class ActionCardBody {
    /**
     * Enum: Input.Text
     */
    public String type;
    /**
     *
     */
    public String id;
    /**
     * If set to `true`, allows multiple lines of input
     */
    public Boolean isMultiline;
    /**
     * Description of the input desired. Displayed when no text has been input
     */
    public String placeholder;

    public ActionCardBody type(String type) {
        this.type = type;
        return this;
    }

    public ActionCardBody id(String id) {
        this.id = id;
        return this;
    }

    public ActionCardBody isMultiline(Boolean isMultiline) {
        this.isMultiline = isMultiline;
        return this;
    }

    public ActionCardBody placeholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }
}
