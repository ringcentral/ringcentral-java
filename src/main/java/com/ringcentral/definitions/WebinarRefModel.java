package com.ringcentral.definitions;

public class WebinarRefModel {
    /** Internal object ID Example: 78654321 */
    public String id;

    public WebinarRefModel id(String id) {
        this.id = id;
        return this;
    }

    /** Webinar title Required Example: All-Hands Webinar */
    public String title;

    public WebinarRefModel title(String title) {
        this.title = title;
        return this;
    }

    /**
     * User-friendly description of the Webinar Example: Quarterly All-hands event to present recent
     * news about our company to employees
     */
    public String description;

    public WebinarRefModel description(String description) {
        this.description = description;
        return this;
    }

    /** Required */
    public HostModel host;

    public WebinarRefModel host(HostModel host) {
        this.host = host;
        return this;
    }
}
