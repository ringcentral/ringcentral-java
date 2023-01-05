package com.ringcentral.definitions;


public class TMUpdatePostRequest
{
    /**
     * Post text.
     */
    public String text;
    public TMUpdatePostRequest text(String text)
    {
        this.text = text;
        return this;
    }
}