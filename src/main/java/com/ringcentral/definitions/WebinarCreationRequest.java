package com.ringcentral.definitions;

public class WebinarCreationRequest {
    /** Webinar title Required Example: All-Hands Webinar */
    public String title;

    public WebinarCreationRequest title(String title) {
        this.title = title;
        return this;
    }

    /**
     * User-friendly description of the Webinar Example: Quarterly All-hands event to present recent
     * news about our company to employees
     */
    public String description;

    public WebinarCreationRequest description(String description) {
        this.description = description;
        return this;
    }

    /** */
    public WcsWebinarSettingsModel settings;

    public WebinarCreationRequest settings(WcsWebinarSettingsModel settings) {
        this.settings = settings;
        return this;
    }

    /** */
    public RcwLinkedUserModel host;

    public WebinarCreationRequest host(RcwLinkedUserModel host) {
        this.host = host;
        return this;
    }
}
