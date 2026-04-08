package com.ringcentral.definitions;

public class WebinarInfoModel {
    /** Webinar title Example: All-Hands Webinar */
    public String title;

    public WebinarInfoModel title(String title) {
        this.title = title;
        return this;
    }

    /**
     * User-friendly description of the Webinar Example: Quarterly All-hands event to present recent
     * news about our company to employees
     */
    public String description;

    public WebinarInfoModel description(String description) {
        this.description = description;
        return this;
    }
}
