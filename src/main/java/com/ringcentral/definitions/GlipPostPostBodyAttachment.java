package com.ringcentral.definitions;


public class GlipPostPostBodyAttachment {
    /**
     * Internal identifier of an attachment
     */
    public String id;
    /**
     * Attachment type
     */
    public String type;

    public GlipPostPostBodyAttachment id(String id) {
        this.id = id;
        return this;
    }

    public GlipPostPostBodyAttachment type(String type) {
        this.type = type;
        return this;
    }

}
