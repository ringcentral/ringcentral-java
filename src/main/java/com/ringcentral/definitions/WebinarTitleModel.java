package com.ringcentral.definitions;


public class WebinarTitleModel
{
    /**
     * Webinar title
     * Required
     * Example: All-Hands Webinar
     */
    public String title;
    public WebinarTitleModel title(String title)
    {
        this.title = title;
        return this;
    }

    /**
     * User-friendly description of the Webinar
     * Example: Quarterly All-hands event to present recent news about our company to employees
     */
    public String description;
    public WebinarTitleModel description(String description)
    {
        this.description = description;
        return this;
    }
}