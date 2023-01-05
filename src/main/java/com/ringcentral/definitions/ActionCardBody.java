package com.ringcentral.definitions;


public class ActionCardBody
{
    /**
     * Enum: Input.Text
     */
    public String type;
    public ActionCardBody type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public String id;
    public ActionCardBody id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * If set to `true`, allows multiple lines of input
     */
    public Boolean isMultiline;
    public ActionCardBody isMultiline(Boolean isMultiline)
    {
        this.isMultiline = isMultiline;
        return this;
    }

    /**
     * Description of the input desired. Displayed when no text has been input
     */
    public String placeholder;
    public ActionCardBody placeholder(String placeholder)
    {
        this.placeholder = placeholder;
        return this;
    }
}