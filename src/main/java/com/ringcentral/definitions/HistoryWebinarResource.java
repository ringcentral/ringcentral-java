package com.ringcentral.definitions;


public class HistoryWebinarResource {
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

    public HistoryWebinarResource id(String id) {
        this.id = id;
        return this;
    }

    public HistoryWebinarResource creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public HistoryWebinarResource lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public HistoryWebinarResource title(String title) {
        this.title = title;
        return this;
    }

    public HistoryWebinarResource description(String description) {
        this.description = description;
        return this;
    }

    public HistoryWebinarResource settings(WebinarSettingsModel settings) {
        this.settings = settings;
        return this;
    }

    public HistoryWebinarResource host(HostModel host) {
        this.host = host;
        return this;
    }
}
