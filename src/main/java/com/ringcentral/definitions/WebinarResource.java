package com.ringcentral.definitions;


public class WebinarResource {
    /**
     * Internal object ID
     * Example: 78654321
     */
    public String id;
    /**
     * Object creation time
     * Required
     * Format: date-time
     */
    public String creationTime;
    /**
     * Object last modification time
     * Required
     * Format: date-time
     */
    public String lastModifiedTime;
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
    public WebinarSettingsModel settings;
    /**
     * Required
     */
    public HostModel host;

    public WebinarResource id(String id) {
        this.id = id;
        return this;
    }

    public WebinarResource creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public WebinarResource lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public WebinarResource title(String title) {
        this.title = title;
        return this;
    }

    public WebinarResource description(String description) {
        this.description = description;
        return this;
    }

    public WebinarResource settings(WebinarSettingsModel settings) {
        this.settings = settings;
        return this;
    }

    public WebinarResource host(HostModel host) {
        this.host = host;
        return this;
    }
}
