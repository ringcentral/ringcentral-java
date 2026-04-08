package com.ringcentral.definitions;

public class WcsWebinarResource {
    /** Internal object ID Example: 78654321 */
    public String id;

    public WcsWebinarResource id(String id) {
        this.id = id;
        return this;
    }

    /** Object creation time Required Format: date-time */
    public String creationTime;

    public WcsWebinarResource creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /** Object last modification time Required Format: date-time */
    public String lastModifiedTime;

    public WcsWebinarResource lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /** Webinar title Example: All-Hands Webinar */
    public String title;

    public WcsWebinarResource title(String title) {
        this.title = title;
        return this;
    }

    /**
     * User-friendly description of the Webinar Example: Quarterly All-hands event to present recent
     * news about our company to employees
     */
    public String description;

    public WcsWebinarResource description(String description) {
        this.description = description;
        return this;
    }

    /** */
    public WcsWebinarSettingsModel settings;

    public WcsWebinarResource settings(WcsWebinarSettingsModel settings) {
        this.settings = settings;
        return this;
    }

    /** Required */
    public WcsHostModel host;

    public WcsWebinarResource host(WcsHostModel host) {
        this.host = host;
        return this;
    }
}
