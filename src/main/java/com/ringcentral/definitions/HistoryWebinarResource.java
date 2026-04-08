package com.ringcentral.definitions;

public class HistoryWebinarResource {
    /** Internal object ID Example: 78654321 */
    public String id;

    public HistoryWebinarResource id(String id) {
        this.id = id;
        return this;
    }

    /** Object creation time Required Format: date-time */
    public String creationTime;

    public HistoryWebinarResource creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /** Object last modification time Required Format: date-time */
    public String lastModifiedTime;

    public HistoryWebinarResource lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /** Webinar title Required Example: All-Hands Webinar */
    public String title;

    public HistoryWebinarResource title(String title) {
        this.title = title;
        return this;
    }

    /**
     * User-friendly description of the Webinar Example: Quarterly All-hands event to present recent
     * news about our company to employees
     */
    public String description;

    public HistoryWebinarResource description(String description) {
        this.description = description;
        return this;
    }

    /** */
    public WebinarSettingsModel settings;

    public HistoryWebinarResource settings(WebinarSettingsModel settings) {
        this.settings = settings;
        return this;
    }

    /** Required */
    public HostModel host;

    public HistoryWebinarResource host(HostModel host) {
        this.host = host;
        return this;
    }
}
