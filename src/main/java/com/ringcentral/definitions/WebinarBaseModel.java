package com.ringcentral.definitions;


public class WebinarBaseModel
{
    /**
     * Webinar title
     * Example: All-Hands Webinar
     */
    public String title;
    public WebinarBaseModel title(String title)
    {
        this.title = title;
        return this;
    }

    /**
     * User-friendly description of the Webinar
     * Example: Quarterly All-hands event to present recent news about our company to employees
     */
    public String description;
    public WebinarBaseModel description(String description)
    {
        this.description = description;
        return this;
    }

    /**
     */
    public WcsWebinarSettingsModel settings;
    public WebinarBaseModel settings(WcsWebinarSettingsModel settings)
    {
        this.settings = settings;
        return this;
    }
}