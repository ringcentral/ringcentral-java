package com.ringcentral.definitions;


public class WcsWebinarRefModel {
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
     *
     */
    public RcwLinkedUserModel host;

    public WcsWebinarRefModel id(String id) {
        this.id = id;
        return this;
    }

    public WcsWebinarRefModel title(String title) {
        this.title = title;
        return this;
    }

    public WcsWebinarRefModel description(String description) {
        this.description = description;
        return this;
    }

    public WcsWebinarRefModel host(RcwLinkedUserModel host) {
        this.host = host;
        return this;
    }
}
