package com.ringcentral.definitions;


public class WebinarRefModel {
    /**
     * Internal object ID
     * Example: 78654321
     */
    public String id;
    /**
     * Webinar title
     * Required
     * Example: All-Hands Webinar
     */
    public String title;
    /**
     * User-friendly description of the Webinar
     * Example: Quarterly All-hands event to present recent news about our company to employees
     */
    public String description;
    /**
     * Required
     */
    public HostModel host;

    public WebinarRefModel id(String id) {
        this.id = id;
        return this;
    }

    public WebinarRefModel title(String title) {
        this.title = title;
        return this;
    }

    public WebinarRefModel description(String description) {
        this.description = description;
        return this;
    }

    public WebinarRefModel host(HostModel host) {
        this.host = host;
        return this;
    }
}
